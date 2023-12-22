import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int num = 0;
        for (int i = 0; i < 4; i++) {
            char c = s.charAt(i);
            if (c == '+') {
                num++;
            } else {
                num--;
            }
        }
        int result = num;

        // 出力
        System.out.println(result);
    }
}
