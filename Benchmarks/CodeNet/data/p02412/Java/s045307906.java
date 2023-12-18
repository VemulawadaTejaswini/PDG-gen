import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    protected static String process(String data) {
        StringBuilder sb = new StringBuilder();
        final String[] lines = splitForLines(data);

        for (String line : lines) {
            final int[] split = split(line);
            int n = split[0];
            int x = split[1];

            if (n == 0 && x == 0) {
                break;
            }

            sb.append(howManyWays(n, x)).append('\n');
        }

        return sb.toString();
    }

    static int howManyWays(int n, int x) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (i >= j || j >= k || i >= k) {
                        continue;
                    }
                    if ((i + j + k) != x) {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }

    private static String readAll(InputStream is) {
        InputStreamReader r = null;
        BufferedReader br = null;

        try {
            r = new InputStreamReader(is);
            br = new BufferedReader(r);
            StringBuilder sb = new StringBuilder();
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s).append('\n');
            }

            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private static String[] splitForLines(String lines) {
        return lines.split("\\n");
    }

    private static int[] split(String s) {
        final String[] s0 = s.split(" ");
        int[] ia = new int[s0.length];

        for (int i = 0; i < s0.length; i++) {
            ia[i] = Integer.parseInt(s0[i]);
        }

        return ia;
    }

    public static void main(String[] args) {
        System.out.print(process(readAll(System.in)));
    }
}