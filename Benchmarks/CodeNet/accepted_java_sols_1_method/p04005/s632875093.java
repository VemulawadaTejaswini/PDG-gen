import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b && b <= c) {
            int temp = a;
            a = c;
            c = temp;
        } else if (a <= c && c <= b) {
            int temp = a;
            a = b;
            b = temp;
        } else if (b <= a && a <= c) {
            int temp = a;
            a = c;
            c = temp;
        } else if (b <= c && c <= a) {
        } else if (c <= a && a <= b) {
            int temp = a;
            a = b;
            b = temp;
        } else if (c <= b && b <= a) {
        }
            
        BigInteger A, B, C, ans;
        A = new BigInteger(Integer.toString(a));
        B = new BigInteger(Integer.toString(b));
        C = new BigInteger(Integer.toString(c));
        BigInteger two = new BigInteger("2");
        if (a%2==0||b%2==0||c%2==0) ans = BigInteger.ZERO;
        else ans = ((((A.add(BigInteger.ONE)).divide(two)).subtract(A.divide(two))).multiply(B)).multiply(C);
        System.out.println(ans);
        
    }
}
    
