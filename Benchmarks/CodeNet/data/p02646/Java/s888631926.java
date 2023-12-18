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
        for(int i = 0; i < t; i++){
            if(a == b){
                out = "YES";
                break;
            }
            //A
            if (b > a) {
                a += v;
            } else {
                a -= v;
            }
            //B
            if(b > a) {
                if(a+v == b+w) {
                    b -= w;
                } else{
                    b += w;
                }
            } else {
                if(a-v == b-w){
                    b += w;
                } else {
                    b -=w;
                }
            }
        }


        // 出力
        System.out.println(out);
    }    
}
