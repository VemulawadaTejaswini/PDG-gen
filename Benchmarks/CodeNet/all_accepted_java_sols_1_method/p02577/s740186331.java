import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger ans = n.remainder(new BigInteger("9"));
        if(ans.equals(BigInteger.ZERO)) System.out.println("Yes");
        else System.out.println("No");
    }
}