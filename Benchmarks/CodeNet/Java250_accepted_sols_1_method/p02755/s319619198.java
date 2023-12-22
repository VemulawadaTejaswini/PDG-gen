import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int tax8 = scanner.nextInt();
        int tax10 = scanner.nextInt();
        int price = 0;
        if (20 < (tax10 - tax8) || (tax10- tax8) < 0) {
            price = -1;
        } else {
            for(int i = 0; i <= 9; i++) {
                int pPrice10 = tax10 * 10;
                int p10 = (int) ((pPrice10 + i)* 0.08);
                if(tax8 != p10) {
                    price = -1;
                    continue;
                } else {
                    price = pPrice10 + i;
                    break;
                }
            }
        }
        System.out.println(price);
    }
}