import java.math.BigInteger;
import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        BigInteger result = BigInteger.ONE;
        long x = (long)Math.pow(10, 18);
        int flag = 0;
 
        long[] A = new long[N];
 
        for(int n=0; n<N; n++){
            A[n] = sn.nextLong();
            if (A[n] == 0) flag = 1;
        }
 
        if(flag == 1) System.out.println(0);
        else{
            for(int n=0; n<N; n++){
                result = result.multiply(BigInteger.valueOf(A[n]));
                if(result.compareTo(BigInteger.valueOf(x)) == 1){
                    System.out.println(-1);
                    flag = 2;
                    break;
                }
            }
            if(flag != 2)System.out.println(result);
        }
    }
}