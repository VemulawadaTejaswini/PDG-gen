import java.util.*;
import java.math.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        BigInteger a = new BigInteger(x);
        System.out.println(a.nextProbablePrime().min(a.subtract(new BigInteger("1")).nextProbablePrime()));
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
