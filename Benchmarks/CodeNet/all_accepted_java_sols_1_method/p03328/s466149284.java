import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int[] sum = new int[1000];
        sum[1] = 1;
        for (int i = 2; i < 1000; i++) {
            sum[i] = sum[i - 1] + i;
        }
        int diff = b - a;
        int result = sum[diff - 1] - a;

        // 出力
        System.out.println(result);
    }
}
