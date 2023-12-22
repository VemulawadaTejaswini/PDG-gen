import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int[] divCount = new int[n + 1];
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divCount[i]++;
                }
            }
        }

        int result = 0;
        for (int count : divCount) {
            if (count == 8) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
