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
        int N = scan.nextInt();
        int X[] = new int[N];
        int min = 101;
        int max = 0;
        for(int i = 0; i < N; i++) {
            X[i] = scan.nextInt();
            min = Math.min(min, X[i]);
            max = Math.max(max, X[i]);
        }

        int ans = Integer.MAX_VALUE;
        for(int i = min ; i <= max; i++){
            int sum = 0;
            for(int j = 0; j < N; j++){
                sum += (X[j]-i)*(X[j]-i);
            }
            ans = Math.min(ans, sum);
        }

        os.println(ans);
    }
}