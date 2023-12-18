import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int max = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                num++;
            } else {
                num--;
            }
            max = Math.max(max, num);
        }
        int result = max;

        // 出力
        System.out.println(result);
    }
}
