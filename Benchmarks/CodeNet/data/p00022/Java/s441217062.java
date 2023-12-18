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
        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) {
                break;
            }
            long result = Long.MIN_VALUE;
            long partialSum = 0;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                partialSum = partialSum + a;
                if (partialSum < 0) {
                    if (a > partialSum) {
                        partialSum = a;
                    }
                }
                if (partialSum > result) {
                    result = partialSum;
                }
            }
            out.println(result);
        }
    }
}