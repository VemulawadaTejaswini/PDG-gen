import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        double b = scn.nextDouble();
        BigInteger ans = new BigInteger("1");

        long B = (long)(b*100);

        ans = ans.multiply(BigInteger.valueOf(a));
        ans = ans.multiply(BigInteger.valueOf(B));

        ans = ans.divide(BigInteger.valueOf(100));

        System.out.println(ans);

        scn.close();


    }


}