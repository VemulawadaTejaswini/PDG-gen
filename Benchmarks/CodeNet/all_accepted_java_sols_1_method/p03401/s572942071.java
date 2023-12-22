import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        int tmp = 0;
        for (int i = 1; i <= N; i++) {
            tmp += Math.abs(A[i - 1] - A[i]);
        }
        tmp += Math.abs(A[N]);

        for (int i = 1; i <= N; i++) {
            int ans = tmp;
            ans -= Math.abs(A[i] - A[i + 1]);
            ans -= Math.abs(A[i - 1] - A[i]);
            ans += Math.abs(A[i - 1] - A[i + 1]);

            System.out.println(ans);
        }
    }
}
