package kadai_008;
public class Price_Chapter08 {
    public static void main(String[] args) {
        int userAge = 30;
        String serviceCost = "3000円";
        serviceCost = switch (userAge) {
            case 10 -> "10代の料金は1000円";
            case 20 -> "20代の料金は2000円";
            case 30 -> "30代の料金は3000円";
            case 40 -> "40代の料金は3000円";
            default -> "それ以外は500円";
        };
        System.out.println(serviceCost);
    }
}