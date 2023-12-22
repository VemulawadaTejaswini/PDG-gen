import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        // 主処理
        int sum = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                sum++;
            } else {
                sum--;
            }
            result = Math.max(result, sum);
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
