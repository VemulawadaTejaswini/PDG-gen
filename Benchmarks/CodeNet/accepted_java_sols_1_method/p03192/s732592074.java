import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        // 主処理
        int result = n.length() - n.replaceAll("2", "").length();

        // 出力
        System.out.println(result);
    }
}
