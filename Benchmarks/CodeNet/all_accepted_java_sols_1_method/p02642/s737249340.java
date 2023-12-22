import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        Set<Integer> p = new HashSet<>();
        int[] count = new int[1000001];
        boolean[] isDiv = new boolean[1000001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            p.add(num);
            if (count[num] < 1) {
                for (int j = num * 2; j < 1000001; j += num) {
                    isDiv[j] = true;
                }
            }
            count[num]++;
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int num : p) {
            if (count[num] == 1 && !isDiv[num]) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
