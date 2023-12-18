import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 処理
        String out = n == m ? "Yes" : "No";

        // 出力
        System.out.println(out);
    }
}