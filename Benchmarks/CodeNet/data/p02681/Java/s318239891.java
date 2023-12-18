
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
        String s = scan.next();
        String t = scan.next();

        String sub = t.substring(0, t.length()-1);

        if(s.equals(sub))
            os.println("Yes");
        else
            os.println("No");
    }
}