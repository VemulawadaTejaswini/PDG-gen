import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int h = sc.nextInt();
        int a = sc.nextInt();

        // 処理
        int out = 0;
        int count = h / a;
        out = count + ((h % a) != 0 ? 1 : 0);

        // 出力
        System.out.println(out);
    }
}