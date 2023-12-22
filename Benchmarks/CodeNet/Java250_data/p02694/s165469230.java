
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
        long X = scan.nextLong();

        long depo = 100;
        int ans = 0;

        while(X > depo) {
            depo *= 1.01;
            ans++;
        }

        os.println(ans);
    }

}