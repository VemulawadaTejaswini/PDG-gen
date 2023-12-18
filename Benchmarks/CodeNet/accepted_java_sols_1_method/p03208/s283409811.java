import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        Arrays.sort(H);
        int ans = 1000000000;
        for (int i = 0; i <= N - K; i++) {
            if (ans > H[i + K - 1] - H[i]) ans = H[i + K - 1] - H[i];
        }
        System.out.println(ans);
        sc.close();
    }
}