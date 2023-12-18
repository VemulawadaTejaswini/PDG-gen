import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        BigInteger prod = new BigInteger("1");
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (st.nextToken());
            if (arr[i].equals("0")) {
                pw.println("0");
                pw.close();
                return;
            }
        }

        for (String x : arr) {
            prod = prod.multiply(new BigInteger(x));
            if (prod.compareTo(new BigInteger("1000000000000000000")) > 0) {
                pw.println("-1");
                pw.close();
                return;
            }
        }

        pw.println(prod);
        pw.close();
    }
}
