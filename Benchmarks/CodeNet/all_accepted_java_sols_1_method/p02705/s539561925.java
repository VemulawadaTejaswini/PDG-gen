import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int r = sc.nextInt();
        //String s = sc.next();

        // 処理
        double out = 2 * Math.PI * r;

        // 出力
        System.out.println(out);
    }
}