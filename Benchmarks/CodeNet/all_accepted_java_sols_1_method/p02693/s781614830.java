import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        //String s = sc.next();

        // 処理
        String out = "NG";
        if(b/k * k >= a) {
            out = "OK";
        }

        // 出力
        System.out.println(out);
    }
}