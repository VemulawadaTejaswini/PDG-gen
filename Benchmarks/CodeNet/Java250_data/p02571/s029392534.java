
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        String S = scan.next();
        String T = scan.next();

        int ans = Integer.MAX_VALUE;
        int maxPattern = S.length() - T.length() + 1;
        for(int i = 0; i < maxPattern; i++) {
            int diff = T.length();
            for(int j = 0; j < T.length(); j++) {
                if(S.charAt(i+j) == T.charAt(j))
                    diff--;
            }
            ans = Math.min(ans, diff);
        }

        os.println(ans);

    }
}