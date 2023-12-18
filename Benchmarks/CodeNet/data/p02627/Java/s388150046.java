import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String a = f.readLine();
        if (Character.isUpperCase(a.charAt(0))) {
            out.println('A');
        } else {
            out.println('a');
        }

        out.close();
    }
}
