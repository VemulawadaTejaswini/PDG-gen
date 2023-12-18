import java.util.*;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        BigDecimal  a = new BigDecimal(sc.next());      // A:整数
        BigDecimal  b = new BigDecimal(sc.next());      // B:小数点以下は二桁

        a = a.multiply(b);  // AxB
        a = a.setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println(a);    // output
    }
}