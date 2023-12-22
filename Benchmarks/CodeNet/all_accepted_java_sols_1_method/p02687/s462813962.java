import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        //long x = sc.nextLong();
        String s = sc.next();

        // 処理
        String out = "ABC";
        if(s.equals("ABC")){
            out = "ARC";
        }

        // 出力
        System.out.println(out);
    }
}