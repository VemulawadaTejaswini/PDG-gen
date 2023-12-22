import java.util.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long a = scan.nextLong();
            list.add(a);
        }

        Collections.sort(list);//System.out.println(list);
        // listの先頭が0だったら、0を出力して即終了
        if (list.get(0) == 0) {
            System.out.println(0);
            return;
        }

        /*
        * 1. BigIntegerクラスを用いて、オーバーフローが起きないようにする。
        BigInteger ans = BigInteger.ONE;
        boolean isOver = false;
        for (int i = 0; i < n; i++) {
            ans = ans.multiply(BigInteger.valueOf(list.get(i)));
            if (ans.compareTo(BigInteger.valueOf(1000000000000000000l)) > 0) {
                isOver = true;
                break;
            }
        } 
        

        if (isOver) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        */


        // 2. multiplyExactメソッド（オーバーフローすると例外送出）を利用する方法。
        long ans = 1l;
        boolean isOver = false;
        try {
            for (int i = 0; i < n; i++) {
                long a = list.get(i);
                ans = Math.multiplyExact(ans, a);
                if (ans > 1000000000000000000l) {
                    isOver = true;
                    break;
                }
            } 
        } catch (ArithmeticException e) {
            isOver = true;
        }
        
        if (isOver) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        
        /* 
        * 3. オーバーフローすると、負の数や0になる可能性があることを考慮して場合わけする。
        long ans = 1l;
        for (int i = 0; i < n; i++) {
            long a = list.get(i);
            ans *= a;
            if (ans > 1000000000000000000l || ans <= 0) {
                break;
            }
        }
        if (ans > 1000000000000000000l || ans <= 0) {
            //System.out.println(ans);
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        */
        
        /*
        * 公式の模範解答を真似たけど、WA
        long ans = 1l;
        boolean isOver = false;
        for (int i = 0; i < n; i++) {
            long a = list.get(i);            
            if (Math.floor(10E+18 / ans) <= a) {
                isOver = true;
                break;
            } else {
                ans *= a;
            }
        }
        if (isOver) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        */

    }
}