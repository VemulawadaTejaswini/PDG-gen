import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Main {

    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private final PrintWriter out = new PrintWriter(System.out);

    public void solve() throws IOException {
        int n = Integer.parseInt(in.readLine());
        BigDecimal[] arr = new BigDecimal[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = new BigDecimal(in.readLine());
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                BigDecimal product = arr[i].multiply(arr[j]);
                if (product.stripTrailingZeros().scale() <= 0) ++ans;
            }
        }
        out.println(ans);
    }

    private void go() throws IOException {
        solve();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().go();
    }
}