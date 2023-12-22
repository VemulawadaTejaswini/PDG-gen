import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());
            String[] in = br.readLine().split(" ");
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in[i]);
            }

            br.close();

            Arrays.sort(a);

            BigInteger ans = BigInteger.valueOf(1);
            for (long i : a) {
                ans = ans.multiply(BigInteger.valueOf(i));
                if (ans.compareTo(BigInteger.valueOf((long) 1e18)) == 1) {
                    System.out.println(-1);
                    return;
                }
            }

            System.out.println(ans);

        }
    }
}