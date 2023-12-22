import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        for (int i = 1;; i++) {
            String x = br.readLine();
            if(x.equals("0")) break;
            out.println("Case "+i+": "+x);
        }
        out.flush();
    }
}