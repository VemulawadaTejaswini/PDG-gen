import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int L = scanner.nextInt();

            long all = 0;
            for (int i = 1; i <= N; i++) {
                all += (L + i - 1);
            }
            long min = Long.MAX_VALUE;
            long answer = 0;
            for (int i = 1; i <= N; i++) {
                long apple = (L + i - 1);
                long rest = all - apple;
                long diff = all - rest;
                if (diff < 0) {
                    diff *= -1;
                }
                if (diff < min) {
                    min = diff;
                    answer = all - apple;
                }
            }
            System.out.println(answer);
        }
    }

}
