import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();

        // 処理
        int out = n / 2 + (n % 2 == 0 ? 0 : 1);

        // 出力
        System.out.println(out);
    }

}