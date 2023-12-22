import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long h = sc.nextLong();
        long w = sc.nextLong();

        // 処理
        long out = (h * w + 1) / 2;
        if (h == 1 || w == 1) {
            out = 1;
        }

        // 出力
        System.out.println(out);
    }
}