import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        char c = s.charAt(k - 1);
        String result = s.replaceAll("[^" + c + "]", "*");

        // 出力
        System.out.println(result);
    }
}
