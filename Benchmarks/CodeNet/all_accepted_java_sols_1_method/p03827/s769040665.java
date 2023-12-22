import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        // 主処理
        int result = 0;
        int sum = 0;
        String[] array = s.split("");
        for (String c : array) {
            if ("I".equals(c)) {
                sum++;
            } else if ("D".equals(c)) {
                sum--;
            }
            result = Math.max(result, sum);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
