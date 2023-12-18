import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String result = s.replace("hi", "").length() == 0 ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}