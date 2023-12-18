import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=(long)((Math.round(sc.nextDouble()*10000)));
        long ans=(a*b)/10000;
        System.out.println(ans);

    }
}
