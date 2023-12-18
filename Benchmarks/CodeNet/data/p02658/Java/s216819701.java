

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger Xx = BigInteger.valueOf((long)1e18);
        BigInteger ans = BigInteger.ONE;
        int n = cin.nextInt();boolean ok = true;
        for(int i = 0 ;i < n;i++){
            BigInteger x = cin.nextBigInteger();
            if(x.equals(BigInteger.ZERO)){
                for(int j = i + 1;j < n;j++){
                    int t = cin.nextInt();
                }
                System.out.println(0);return ;
            }
            ans = ans.multiply(x);
            if(ans.compareTo(Xx) > 0){
                ok = false;
            }
        }
        System.out.println(ok == true ? ans : -1);
    }
}

