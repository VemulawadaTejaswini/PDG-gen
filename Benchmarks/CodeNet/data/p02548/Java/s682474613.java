import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long res = 0;

        for (int i = 1; i < n; ++i) {
            res += n / i - (n % i == 0 ? 1 : 0);
        }

        bw.write(Long.toString(res));

        bw.close();
        br.close();
    }
}
