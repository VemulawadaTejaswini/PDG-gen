import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // 主処理
        int result = n % 2 == 0 ? n : n * 2;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
