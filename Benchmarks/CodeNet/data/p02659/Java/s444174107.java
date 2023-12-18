import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Main {

    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private final PrintWriter out = new PrintWriter(System.out);

    public void solve() throws IOException {
        String[] vals = in.readLine().split(" ");
        out.println(new BigDecimal(vals[0]).multiply(new BigDecimal(vals[1])).toBigInteger());
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