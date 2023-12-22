import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// <10^5
        int m = sc.nextInt();// <10^9
        
        int probMaxGcd = m / n;
        int gcd;
        for(gcd = probMaxGcd; gcd >= 1; gcd--) {
            // 最大公約数*整数の和も最大公約数で割り切れる
            if(m % gcd == 0) {
                break;
            }
        }
        System.out.println(gcd);
    }
}
