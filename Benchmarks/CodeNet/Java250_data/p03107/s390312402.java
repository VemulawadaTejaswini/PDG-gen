import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int count0 = s.replaceAll("[^0]", "").length();
        int count1 = s.replaceAll("[^1]", "").length();
        int result = Math.min(count0, count1) * 2;

        // 出力
        System.out.println(result);
    }
}
