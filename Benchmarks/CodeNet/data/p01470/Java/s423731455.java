import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger MOD = new BigInteger("4294967311");

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            BigInteger ans = BigInteger.ZERO;

            for(int i = 0; i < n; i++){
                int o = sc.nextInt();
                BigInteger y = sc.nextBigInteger();

                if(o == 1){
                    ans = ans.add(y).mod(MOD);
                }
                else if(o == 2){
                    ans = ans.add(MOD).subtract(y).mod(MOD);
                }
                else if(o == 3){
                    ans = ans.multiply(y).mod(MOD);
                }
                else if(o == 4){
                    ans = ans.multiply(y.modInverse(MOD)).mod(MOD);
                }
            }

            BigInteger tmp = new BigInteger(Long.toString(1L<<31));

            if(ans.compareTo(tmp) >= 0){
                ans = ans.subtract(MOD);
            }

            System.out.println(ans);
        }
    }
}