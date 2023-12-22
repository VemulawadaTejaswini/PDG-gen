
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
        int M = scan.nextInt();
        int need = 0;

        for(int i = 0; i < M; i++) {
            need += scan.nextInt();
        }

        if(N >= need)
            os.println(N-need);
        else
            os.println(-1);
    }

}