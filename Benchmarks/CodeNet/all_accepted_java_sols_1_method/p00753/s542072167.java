import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static int N = 123456 * 2 + 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        int[] prim = new int[N];

        prim[0] = -1;
        for (int i = 2; i < N / 2; i++) {
            for (int j = 2; j < N / i + 1; j++) {
                if (prim[i] == 0) {
                    prim[i * j] = -1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (prim[i] == 0) {
                prim[i] = ++count;
            } else {
                prim[i] = count;
            }
        }

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            System.out.println(prim[n * 2] - prim[n]);
        }
    }
}