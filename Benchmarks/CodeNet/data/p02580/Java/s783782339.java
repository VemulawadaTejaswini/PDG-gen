import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < h; i++) {
            map.put(i, new ArrayList<>());
        }
        int[] countH = new int[h];
        int[] countW = new int[w];
        for (int i = 0; i < m; i++) {
            int indexH = Integer.parseInt(sc.next()) - 1;
            int indexW = Integer.parseInt(sc.next()) - 1;
            countH[indexH]++;
            countW[indexW]++;
            map.get(indexH).add(indexW);
        }
        sc.close();

        // 主処理
        int filterH = Arrays.stream(countH).max().orElse(0) - 1;
        int filterW = Arrays.stream(countW).max().orElse(0) - 1;
        int MAX = filterH + filterW + 3;

        int result = 0;
        for (int i = 0; i < h; i++) {
            if (filterH <= countH[i]) {
                for (int j = 0; j < w; j++) {
                    if (filterW <= countW[i]) {
                        int minus = map.get(i).contains(j) ? 1 : 0;
                        result = Math.max(result, countH[i] + countW[j] - minus);
                        if (MAX == result) {
                            break;
                        }
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
