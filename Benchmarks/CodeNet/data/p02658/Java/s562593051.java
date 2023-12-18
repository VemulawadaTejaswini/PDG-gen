import java.util.*;
import java.math.BigInteger;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
 
        BigInteger product = new BigInteger("1");
        long limit = (long) Math.pow(10, 18);
       
        
        for (int i = 1; i <= N; i++) {
            long A_i = scan.nextLong();
            product = product.multiply(BigInteger.valueOf(A_i));
        
        }
       
        
        if (product.compareTo(BigInteger.valueOf(limit))==1) {
            System.out.println("-1");
            return;
        } 
        
        else {
            System.out.println(product);
        }
        
    }
 
}