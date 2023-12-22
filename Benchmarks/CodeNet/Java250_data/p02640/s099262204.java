
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
        int X = scan.nextInt();
        int Y= scan.nextInt();

        int kame = 0;

        for(; kame <= X; kame++) {
            int tsuru = X-kame;
            if(tsuru*2 + kame*4 == Y){
                os.println("Yes");
                return;
            }
        }

        os.println("No");

    }
}