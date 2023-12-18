import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String c = sc.next();
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result;
        if ("+".equals(c)) {
            result = a + b;
        } else {
            result = a - b;
        }

        // 出力
        System.out.println(result);
    }
}
