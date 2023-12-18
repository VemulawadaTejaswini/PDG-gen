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
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(" ");
            int n = Integer.parseInt(values[0]);
            int s = Integer.parseInt(values[1]);
            int result = calc(new int[n], 0, s, 0);
            out.println(result);
        }
    }

    private static int calc(int[] permutaion, int k, int s, int sk) {
        if (k == permutaion.length) {
            return s == sk ? 1 : 0;
        }
        int result = 0;
        for (int i = 0; i < 10; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (i == permutaion[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                continue;
            }
            int t = sk + i * (k + 1);
            if (t > s) {
                break;
            }
            permutaion[k] = i;
            result += calc(permutaion, k + 1, s, t);
        }
        return result;
    }
}