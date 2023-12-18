import java.util.*;
import java.math.*;
public class GCD {
        static Scanner sc = new Scanner(System.in);
        static BigInteger a,b;
        public static void main(String[] args) {
                while(read()){
                        solve();
                }
        }
        static boolean read(){
                if(!sc.hasNext())
                        return false;
                a = sc.nextBigInteger(); b = sc.nextBigInteger();
                return true;
        }
        static void solve(){
                System.out.println(a.gcd(b));
        }
 
}