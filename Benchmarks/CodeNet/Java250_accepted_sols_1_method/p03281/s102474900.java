import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int count = 0;
            for (int n = 1; n <= N; n += 2) {
                int count2 = 0;
                for (int d = 1; d <= n; d++) {
                    if (n % d == 0) {
                        count2++;
                    }
                }
                if (count2 == 8) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}
