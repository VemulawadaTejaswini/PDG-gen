import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int sum[] = { 0, 0 };
            while (n-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a == b) {
                    sum[0] += a;
                    sum[1] += b;
                } else {
                    sum[a > b ? 0 : 1] += a + b;
                }
            }
            System.out.println(sum[0] + " " + sum[1]);
        }
    }
}

