
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        long N = scan.nextLong();
        long K = scan.nextLong();

        long ans = 0;

        if(K < N) {
            ans = Math.min(Math.abs(K*(N/K) - N), Math.abs(K*(N/K+1) - N));
            os.println(ans);
        } else if (N < K) {
            ans = Math.min(N, Math.abs(K-N));
            os.println(ans);
        } else if(N == K) {
            os.println(0);
        }


    }
}