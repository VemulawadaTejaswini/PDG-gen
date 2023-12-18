import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        boolean judge = s.charAt(0) != s.charAt(1) || s.charAt(1) != s.charAt(2);
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}