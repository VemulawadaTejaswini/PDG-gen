import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        sc.close();

        // 主処理
        int result = 0;
        for (String num : s) {
            result += Integer.parseInt(num);
        }

        // 出力
        System.out.println(result);
    }
}
