import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();

        // 主処理
        boolean judge = n.contains("1") && n.contains("9") && n.contains("7") && n.contains("4");
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
