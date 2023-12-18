import java.util.Scanner;

/**
 * Face Produces Unhappiness
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            char[] S = sc.next().toCharArray();

            int r = 1;
            char pre = S[0];
            for (int i = 1; i < N; i++) {
                if (pre != S[i]) {
                    r++;
                    pre = S[i];
                }
            }

            int ans = N - Math.max(r - K * 2, 1);

            System.out.println(ans);
        }
    }

}
