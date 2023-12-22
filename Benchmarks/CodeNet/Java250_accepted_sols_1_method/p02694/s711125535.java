import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long x = sc.nextLong();
        //String s = sc.next();

        // 処理
        long out = 0;
        long work = 100;
        while(true){
            work = (long)(work * 1.01);
            out += 1;
            if(work >= x) break;
        }

        // 出力
        System.out.println(out);
    }
}