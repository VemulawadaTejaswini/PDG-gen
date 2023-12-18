import java.math.BigDecimal;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();


//        System.out.println((2*(n-d)*Math.pow(n,(m-2))*(m-1)));
        if(d!=0)
            System.out.println(BigDecimal.valueOf((2*(n-d)*(m-1))/Math.pow(n,2)).toPlainString());

        else
            System.out.println(BigDecimal.valueOf(((n-d)*(m-1))/Math.pow(n,2)).toPlainString());

    }
}