
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int sub[] = new int[N];
        for (int i = 0; i < N-1; i++) {
            sub[scan.nextInt()-1]++;
        }

        for (int i = 0; i < N; i++)
            os.println(sub[i]);

    }
}