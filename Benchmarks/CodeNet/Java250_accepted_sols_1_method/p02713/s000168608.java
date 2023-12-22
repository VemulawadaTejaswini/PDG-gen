import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    sum += BigInteger.valueOf(i).gcd(BigInteger.valueOf(j)).gcd(BigInteger.valueOf(k)).intValue();
                }
            }
        }
        System.out.println(sum);
    }
}