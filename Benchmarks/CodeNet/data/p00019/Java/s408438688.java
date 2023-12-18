import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(reader.readLine());
        out.println(factors[n]);
    }

    static String[] factors = { "1", "1", "2", "6", "24", "120", "720", "5040",
            "40320", "362880", "3628800", "39916800", "479001600",
            "6227020800", "87178291200", "1307674368000", "20922789888000",
            "355687428096000", "6402373705728000", "121645100408832000",
            "2432902008176640000" };
}