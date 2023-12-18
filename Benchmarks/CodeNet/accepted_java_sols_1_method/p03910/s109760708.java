import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 1; i <= n; i++) {
            long sum = i * (i + 1) / 2;
            if (sum <= n) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (j == sum - n) {
                    continue;
                }
                System.out.println(j);
            }
            break;
        }
    }

}
