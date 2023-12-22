
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
        if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5))
            os.println("Yes");
        else
            os.println("No");
    }
}