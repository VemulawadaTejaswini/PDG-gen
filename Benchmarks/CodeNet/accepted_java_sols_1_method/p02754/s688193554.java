import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        // 処理
        long out = 0;
        if(a == 0){
            //
        } else {
            long num = a + b;
            long m = n / num;
            out = a * m;
            long check = n % num;
            if(check != 0){
                //min(check, a)
                out += check < a ? check : a;
            }

        }

        // 出力
        System.out.println(out);
    }

}