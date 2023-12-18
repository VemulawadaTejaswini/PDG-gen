
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
        int K = scan.nextInt();
        String S = scan.next();
        if(S.length() <= K){
            os.println(S);
            return;
        }

        os.println(S.substring(0,K)+"...");

    }

}