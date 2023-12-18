import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String str = s.replace("-", "");
        int result = str.length() - (4 - str.length());

        // 出力
        System.out.println(result);
        sc.close();
    }
}