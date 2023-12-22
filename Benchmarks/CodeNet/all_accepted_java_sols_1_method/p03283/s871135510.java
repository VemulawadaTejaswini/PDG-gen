import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt(), Q = in.nextInt();
        int[][] map = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            map[in.nextInt()][in.nextInt()]++;
        }
        for (int i = 0; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] += map[i][j-1];
            }
        }
        for (int i = 0; i < Q; i++) {
            int a = in.nextInt(), b = in.nextInt();
            if(b < a) {
                int tmp = a; a = b; b = tmp;
            }
            int ans = 0;
            for (int k = a; k <= b; k++) {
                ans += map[k][b] - map[k][a - 1];
            }
            System.out.println(ans);
        }
    }
}