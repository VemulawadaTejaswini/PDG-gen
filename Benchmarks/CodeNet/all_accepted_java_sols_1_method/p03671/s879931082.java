import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        int result = Math.min(Math.min(ab, ac), bc);

        // 出力
        System.out.println(result);
    }
}
