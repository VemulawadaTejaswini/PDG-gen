
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
        int N = scan.nextInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for(int i = 0; i < N; i++) {
            String s = scan.next();
            switch (s) {
                case "AC":
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;
                    break;
            }
        }


        os.println("AC x " + ac);
        os.println("WA x " + wa);
        os.println("TLE x " + tle);
        os.println("RE x " + re);
    }
}