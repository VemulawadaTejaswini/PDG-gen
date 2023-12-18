import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        //String s = sc.next();

        // 処理
        //時針(0-11)
        double ao = 2*Math.PI / (12 * 60);
        double ax = a * (Math.sin((h * 60 + m) * ao));
        double ay = a * (Math.cos((h * 60 + m) * ao));;

        //分針(0-59)
        double bx = b * (Math.sin(2*Math.PI * m / 60));
        double by = b * (Math.cos(2*Math.PI * m / 60));;

        //距離
        double out = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));

        // 出力
        System.out.println(out);
    }
}
