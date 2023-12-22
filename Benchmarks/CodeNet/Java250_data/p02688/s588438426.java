
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
        int K = scan.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++)
            set.add(i);

        for(int i = 0; i < K; i++) {
            int d = scan.nextInt();
            for(int j = 0; j < d; j++) {
                int A = scan.nextInt()-1;
                set.remove(A);
            }
        }

        os.println(set.size());
    }

}