import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// <10^5
        int m = sc.nextInt();// <10^9
        
        
        int[] a = new int[n];
        
        // Arrays.fill(a, 1);
        int probMaxGcd = m / n;
        int gcd;
        for(gcd = probMaxGcd; gcd >= 1; gcd--) {
            // 最大公約数*整数の和も最大公約数で割り切れ
            if(m % gcd != 0) {
                continue;
            }
            // NGはここで超える
            // 超えてなければ答え
            if(gcd * n <= m) {
                break;
            }
        }
        System.out.println(gcd);
    }
}
