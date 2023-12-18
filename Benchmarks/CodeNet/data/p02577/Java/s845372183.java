import java.util.*;
import java.math.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        BigInteger n = new BigInteger(scan.next());
        System.out.println(n.remainder(new BigInteger("9")).toString().equals("0") ? "Yes" : "No");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
