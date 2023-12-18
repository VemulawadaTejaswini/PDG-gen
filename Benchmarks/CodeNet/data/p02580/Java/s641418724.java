import java.util.*;

public class Main {

    private static final int INF = 1_000_000_000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        int[] rowCnt = new int[H];
        int[] colCnt = new int[W];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < H; i++) {
            map.put(i,new HashSet<>());
        }
        for (int i = 0; i < M; i++) {
            int h = sc.nextInt()-1;
            int w = sc.nextInt()-1;
            rowCnt[h]++;
            colCnt[w]++;
            map.get(h).add(w);
        }

        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int tmp = rowCnt[i] + colCnt[j];
                if (map.get(i).contains(j)) {
                    tmp--;
                }
                ans = Math.max(ans, tmp);
            }
        }

        System.out.println(ans);
    }
}
