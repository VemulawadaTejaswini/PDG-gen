import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char POSSIBLE = '1';
        char IMPOSSIBLE = '0';

        int over100 = n / 100;
        int under100 = n % 100;

        int[] rimit = new int[20];

        for (int i = 1; i <= 20; i++) {
            rimit[i - 1] = i * 5;
        }

        if (n >= 2000) {
            System.out.println(POSSIBLE);
            return;
        }

        if (over100 == 0) {
            System.out.println(IMPOSSIBLE);
            return;
        }
        if (under100 <= rimit[over100 - 1]) {
            System.out.println(POSSIBLE);
            return;
        }
        System.out.println(IMPOSSIBLE);
    }
}
