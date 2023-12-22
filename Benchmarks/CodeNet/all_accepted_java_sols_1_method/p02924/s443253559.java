import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if(N == 1L){
            System.out.println(0);
        }else{
            BigInteger n1 = BigInteger.valueOf(N);
            BigInteger n2 = BigInteger.valueOf(N - 1L);
            System.out.println((n1.multiply(n2).divide(BigInteger.valueOf(2L))).toString());
        }
    }
    
}
