import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int h = sc.nextInt();
        int n = sc.nextInt();

        // 処理
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        String out = sum >= h ? "Yes" : "No";

        // 出力
        System.out.println(out);
    }
}