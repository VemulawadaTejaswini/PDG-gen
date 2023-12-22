import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long n = sc.nextLong();
        long k = sc.nextLong();

        // 処理
        //nがkより大きいとき、n % kを求め、それをnとする
        n = n % k;

        long out = 0;
        long w1;
        long w2 = n;
        boolean flg = true;
        if ( k == 1){
            out = 0;
        } else {
            while(flg){
                w1 = w2 - k;
                w1 = w1 >= 0 ? w1 : -w1;
                if (w1 >= w2) {
                    out = w2;
                    flg = false;
                }
                w2 = w1;
            }
        }

        // while(out >= k){
        //     out = n > k ? n - k : k - n;
        // }

        // 出力
        System.out.println(out);
    }
}