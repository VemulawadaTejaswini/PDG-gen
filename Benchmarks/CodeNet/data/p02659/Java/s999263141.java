import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
//1000000000000000000
public class Main {
    public static void main(String ars[]){
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        BigInteger s = BigInteger.valueOf((long) (a*b));
        System.out.println(s.toString());
    }
}
