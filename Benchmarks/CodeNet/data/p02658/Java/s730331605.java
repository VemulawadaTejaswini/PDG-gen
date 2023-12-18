import java.util.Scanner;
import java.math.BigInteger;
import java.util.function.BiFunction;

public class abc169b {
    public static BigInteger solve(BigInteger res,BigInteger n){
        return res.multiply(n);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        BigInteger b=new BigInteger("1000000000000000000");
        BigInteger res=new BigInteger("1");
        boolean flag=true;
        while(n-->0){
            long l=sc.nextLong();
            if(l==0){
                System.out.println(0);
                System.exit(0);}
            res=solve(res,new BigInteger(String.valueOf(l)));
            if(res.compareTo(b)>0){
                System.out.println(-1);
                flag=false;
                        break;}
        }
        if(flag)
            System.out.println(res);
    }
}
