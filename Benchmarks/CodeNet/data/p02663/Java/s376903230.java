import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();
        //String s = sc.next();

        // 処理
        //int out = 0;
        int times = (h2 * 60 + m2) - (h1* 60 + m1) - 1;
        int out = (times / k) * k;

        // 出力
        System.out.println(out);
    }    
}
