import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong() - 0;
            int k = 1;
            long n = 26;
            long sum = 26;
            long prev = 0;
            for (; N > sum;) {
                k++;
                n *= 26;
                prev = sum;
                sum += n;
            }

            long N2 = N - prev - 1;
            String name = dfs(N2, k);

            System.out.println(name);
        }
    }

    private static String dfs(long n, int k) {
        if (k <= 0) {
            return "";
        }
        return dfs(n / 26, k - 1) + (char) ('a' + ((n % 26)));
    }

}
