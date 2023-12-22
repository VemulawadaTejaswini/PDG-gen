import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        BigInteger res=in.nextBigInteger();--n;
        while(n--!=0){
            BigInteger b=in.nextBigInteger();
            res=res.multiply(b).divide(res.gcd(b));
        }
        System.out.print(res);
    }
}
