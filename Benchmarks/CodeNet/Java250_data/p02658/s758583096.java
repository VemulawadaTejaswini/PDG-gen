import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();

        
        BigInteger dMax = BigInteger.valueOf((long)Math.pow(10, 18));

        long[] a = new long[n];
        BigInteger mul = BigInteger.ONE;
        BigInteger tmp = null;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();

            if (a[i] == 0) {
                System.out.println("0");
                return ;
            }
        }

        for(int i=0;i<n;i++){

            tmp = BigInteger.valueOf(a[i]);
            if (mul.multiply(tmp).compareTo(dMax) > 0 ) {
                System.out.println("-1");
                return ;
            } else {
                mul = mul.multiply(tmp);
            }
        }

        System.out.println(mul.toString());
    }
}

