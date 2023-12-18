import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int l = sc.nextInt();

        // 処理
        double part = l / 3.0;
        double out = part * part * (l - 2 * part);

        // 出力
        //System.out.println(out);
        System.out.println(String.format("%.10f", out));
    }
}