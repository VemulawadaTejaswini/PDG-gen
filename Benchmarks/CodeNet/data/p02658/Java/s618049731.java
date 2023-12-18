import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger[] A = new BigInteger[N];
        for(int i = 0; i< N; i++) {
            A[i] = sc.nextBigInteger();
        }

        BigInteger mult= new BigInteger("1");
        for(int i = 0; i< N; i++) {
            mult=A[i].multiply(mult);
        }
        BigInteger max= new BigInteger("1000000000000000000");
        int comparevalue = mult.compareTo(max);
        if (comparevalue > 0) {
            System.out.println("-1");
        } else {
            System.out.println(mult);
        }
    }
}
