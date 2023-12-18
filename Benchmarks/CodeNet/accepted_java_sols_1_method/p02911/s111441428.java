import java.util.Scanner;

/**
 * Attack Survival
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            int Q = sc.nextInt();

            int[] P = new int[N];
            for (int i = 0; i < Q; i++) {
                int n = sc.nextInt() - 1;
                P[n]++;
            }

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < N; i++) {
                if (K - Q + P[i] > 0) {
                    ans.append("Yes");
                } else {
                    ans.append("No");
                }
                ans.append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}
