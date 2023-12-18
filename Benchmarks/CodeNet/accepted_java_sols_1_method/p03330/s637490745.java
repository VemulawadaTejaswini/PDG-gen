import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), C = in.nextInt();
        int[][] D = new int[C][C], c = new int[N][N];
        for(int i = 0; i < C; i++){
            for(int j = 0; j < C; j++) {
                D[i][j] = in.nextInt();
            }
        }
        Map<Integer, Integer>[] maps = new Map[3];
        for(int i = 0; i < 3; i++) maps[i] = new HashMap<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                int num = in.nextInt() - 1;
                Integer cnt = maps[(i + j) % 3].get(num);
                maps[(i + j) % 3].put(num, cnt == null ? 1 : cnt + 1);
            }
        }
        int[][] cost = new int[3][C];
        for(int i = 0; i < 3; i++) {
            Map<Integer, Integer> map = maps[i];
            for(int j = 0; j < C; j++) {
                int sum = 0;
                for(int a : map.keySet()) {
                    if(a == j) continue;
                    sum += D[a][j] * map.get(a);
                }
                cost[i][j] = sum;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < C; i++) {
            for(int j = 0; j < C; j++) {
                for(int k = 0; k < C; k++) {
                    if(i == j || i == k || j == k) continue;
                    ans = Math.min(ans, cost[0][i] + cost[1][j] + cost[2][k]);
                }
            }
        }
        System.out.println(ans);
    }
}
