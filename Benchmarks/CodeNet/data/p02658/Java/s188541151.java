

import java.math.BigInteger;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger Xx = BigInteger.valueOf((long)1e18);
        BigInteger ans = BigInteger.ONE;
        int n = cin.nextInt();
        for(int i = 0 ;i < n;i++){
            BigInteger x = cin.nextBigInteger();
            ans = ans.multiply(x);
            if(ans.compareTo(Xx) > 0){
                System.out.println(-1);return ;
            }
        }
        System.out.println(ans);
    }
}

