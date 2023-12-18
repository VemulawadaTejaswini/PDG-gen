import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();
        //String s = sc.next();

        // 処理
        int out = n;
        for(int i = 0; i < m; i++){
            out -= sc.nextInt();
        }
        if (out < 0) out = -1;

        // 出力
        System.out.println(out);
    }
}