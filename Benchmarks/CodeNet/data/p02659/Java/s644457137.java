import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        //String t = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // 
        double tmp = Math.floor(a * b);
        long out = (long)tmp;

        // 出力
        System.out.println(out);
    }    
}
