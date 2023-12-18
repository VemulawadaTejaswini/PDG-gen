import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal v = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        BigDecimal w = sc.nextBigDecimal();
        int t = sc.nextInt();

        for(int i=1; i<=t; i++){
            a = a.add(v);
            b = b.add(w);

            if(a.compareTo(b)>=0){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}
