import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] l = new long[n];
        for (int i = 0; i < n; i++) {
            l[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean isNotSame = l[i] != l[j] && l[i] != l[k] && l[j] != l[k];
                    boolean canMakeTriangle = l[i] < l[j] + l[k] && l[j] < l[i] + l[k] && l[k] < l[i] + l[j];
                    if (isNotSame && canMakeTriangle) {
                        result++;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
