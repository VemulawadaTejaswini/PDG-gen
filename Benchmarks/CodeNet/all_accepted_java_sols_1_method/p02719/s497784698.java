import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        long n = Long.parseLong(inputs[0]);
        long k = Long.parseLong(inputs[1]);

        n -= (long)(n/k) * k;
        n = Math.min(n, k-n);

        pw.println(n);
        pw.flush();
    }
}