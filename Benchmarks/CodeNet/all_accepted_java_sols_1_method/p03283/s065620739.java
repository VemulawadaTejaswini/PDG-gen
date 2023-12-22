import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] cnt = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            cnt[L][R]++;
        }

        int[][] prefSum = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                prefSum[i][j] = prefSum[i][j-1]+cnt[i][j];
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int tmp = 0;
            for (int l = p; l <= q; l++) {
                tmp += prefSum[l][q]-prefSum[l][p-1];
            }
            ans.append(tmp).append('\n');
        }

        System.out.print(ans);
    }
}
