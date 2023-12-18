import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int digsum = 0;
        int len = Integer.toString(n).length();
        for (int i = 1; i <= len; i++) {
            int num = (int) Math.pow(10, i);
            digsum += n % num / (num / 10);
        }

        boolean judge = n % digsum == 0;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
