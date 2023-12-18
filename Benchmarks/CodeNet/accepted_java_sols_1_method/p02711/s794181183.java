import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = n / 10 * 10;
        int flag = 0;
        if (n - value == 7) {
            flag = 1;
        }

        value = n / 10;
        value = value / 10 * 10;
        if (n / 10 - value == 7) {
            flag = 1;
        }

        if (n / 100 == 7) {
            flag = 1;
        }

        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}