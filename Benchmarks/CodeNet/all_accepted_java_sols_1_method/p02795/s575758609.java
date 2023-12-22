import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int M = Math.max(H, W);

            int ans = (N + M - 1) / M;
            System.out.println(ans);
        }
    }

}
