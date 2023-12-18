import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(f.readLine());
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i +1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++) {
                    int[] ar = {l[i], l[j], l[k]};
                    Arrays.sort(ar);
                    if (ar[0] == ar[1]) continue;
                    if (ar[1] == ar[2]) continue;
                    int sum = ar[0] + ar[1];
                    if (sum > ar[2]) {
                        res++;
                    }
                }
        }

        out.println(res);
        out.close();
    }

}