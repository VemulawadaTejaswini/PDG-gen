import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        ArrayList<Long> aa = new ArrayList<Long>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        BigInteger min = BigInteger.valueOf(1L);
        final BigInteger max = BigInteger.valueOf(1_000_000_000_000_000_000L);
        for(int i=0; i<n; i++) {
            aa.add(sc.nextLong());
            if(aa.get(i)==0L) {
                System.out.println("0");
                return ;
            }
        }
        for(long a : aa) {
            min = min.multiply(BigInteger.valueOf(a));
            if(min.compareTo(max) > 0) {
                System.out.println("-1");
                return ;
            }
        }
            System.out.println(min);
        sc.close();
        
    }
}
