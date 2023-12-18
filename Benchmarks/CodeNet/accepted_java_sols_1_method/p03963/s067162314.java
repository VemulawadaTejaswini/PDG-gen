import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        // 主処理
        long result = (long) Math.pow(k - 1, n - 1) * k;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
