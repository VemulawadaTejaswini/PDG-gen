import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        char[] array = s.toCharArray();
        int result = 0;
        for (char c : array) {
            result += c == '+' ? 1 : -1;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
