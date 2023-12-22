import java.util.*;
import java.math.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        double d = sc.nextDouble();
        sc.close();
        BigDecimal b1 = BigDecimal.valueOf(l);
        BigDecimal b2 = BigDecimal.valueOf(d);
        BigDecimal b3 = b2.multiply(b1);
        String s = b3.toPlainString();
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < c.length; i++){
            if(c[i] != '.'){
                sb.append(c[i]);
            }else{
                break;
            }
        }
        System.out.println(sb.toString());
    }
}