import java.util.Scanner;
import java.math.BigInteger;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextLong();
        }

        for(int k = 0; k<n; k++){
            if(a[k] == 0){
                System.out.println(0);
                return;
            }   
        }

        BigInteger mul = BigInteger.ONE;
        for(int j = 0; j<n; j++){
            mul = mul.multiply(BigInteger.valueOf(a[j]));
            if(mul.compareTo(BigInteger.valueOf(1000000000000000000L)) == 1){
                mul = BigInteger.valueOf(-1);
                j=n;
            }
        }
        System.out.println(mul);
    }
}