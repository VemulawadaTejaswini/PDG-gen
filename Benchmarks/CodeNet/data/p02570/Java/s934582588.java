
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
        int D = scan.nextInt();
        int T = scan.nextInt();
        int S = scan.nextInt();

        int ans;

        if(D <= T*S){
            os.println("Yes");
        } else {
            os.println("No");
        }

    }
}