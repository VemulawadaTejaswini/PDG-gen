
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
        int L[] = new int[N];
        for (int i = 0; i < N; i++)
            L[i] = scan.nextInt();

        Arrays.sort(L);

        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (L[i] != L[j] && L[i] != L[k] && L[j] != L[k]) {
                        if (L[i] + L[j] > L[k] && L[i] + L[k] > L[j] && L[k] + L[j] > L[i]) {
                            ans++;
                        }
                    }
                }
            }
        }
        os.println(ans);
    }
}