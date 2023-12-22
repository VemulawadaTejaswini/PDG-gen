import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] price = String.valueOf(n).split("");

        if (n <= 1000) {
            System.out.println(1000 - n);
            return;
        }

        if (Integer.parseInt(price[1]) == 0 && Integer.parseInt(price[2]) == 0 && Integer.parseInt(price[3]) == 0) {
            System.out.println(0);
            return;
        }

        System.out.println((Integer.parseInt(price[0]) + 1) * 1000 - n);
    }
}