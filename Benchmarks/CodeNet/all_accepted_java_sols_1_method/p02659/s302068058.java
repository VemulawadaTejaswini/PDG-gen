import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        BigDecimal a,b;
        a=sc.nextBigDecimal();
        b=sc.nextBigDecimal();
        BigDecimal ans=a.multiply(b);



        System.out.println(ans.setScale(0, BigDecimal.ROUND_DOWN));
    }
}
