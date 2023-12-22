import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        // 主処理
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        String result = (ab == c || ac == b || bc == a) ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
