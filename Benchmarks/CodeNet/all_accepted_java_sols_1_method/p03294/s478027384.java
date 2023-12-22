import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger seed = new BigInteger("90000");
        BigInteger[] a = new BigInteger[N];
        //a[0]=seed.nextProbablePrime();
        for(int n=0;n<N;n++) a[n] = new BigInteger(sc.next());
        
        BigInteger m = BigInteger.ONE;
        for(int n=0;n<N;n++) m = m.multiply(a[n]);
        m = m.subtract(BigInteger.ONE);
        
        BigInteger ans = BigInteger.ZERO;
        for(int n=0;n<N;n++){
        	ans = ans.add(m.mod(a[n]));
        }
        System.out.println(ans);
    }
}