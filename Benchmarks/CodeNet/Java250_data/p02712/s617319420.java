import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] a = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    continue;
                }
                a[i] = i;
            }

            long sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += a[i];
            }

            System.out.println(sum);
        }
    }
}
