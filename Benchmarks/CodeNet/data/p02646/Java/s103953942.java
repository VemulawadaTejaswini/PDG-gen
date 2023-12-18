import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        //String s = sc.next();
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        //double b = sc.nextDouble();

        // 
        String out = "NO";
        int zahyo_sa = Math.abs(b - a);
        if (zahyo_sa == 0){
            out = "YES";
        } else {
            int sokudo_sa = v - w;
            if(!(sokudo_sa <= 0)){
                if ((zahyo_sa % sokudo_sa) == 0){
                    if((zahyo_sa / sokudo_sa) <= t){
                        out = "YES";
                    }
                }
            }
        }

        // 出力
        System.out.println(out);
    }    
}
