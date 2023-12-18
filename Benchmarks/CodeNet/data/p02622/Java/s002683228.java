import java.util.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        String t = scan.next();

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i, i + 1).equals(t.substring(i, i + 1))) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}