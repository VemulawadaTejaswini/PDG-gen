import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        int result = 0;
        for (int i = s.length() - 1; 0 < i && result == 0; i--) {
            if (i % 2 == 0) {
                String head = s.substring(0, i / 2);
                String foot = s.substring(i / 2, i);
                if (head.equals(foot)) {
                    result = i;
                }
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
