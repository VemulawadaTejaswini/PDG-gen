import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String line = stdin.readLine();
        String[] arg = line.split("\\s");
        int n = Integer.parseInt(arg[0]);
        int d = Integer.parseInt(arg[1]);

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            line = stdin.readLine();
            arg = line.split("\\s");
            long p = Integer.parseInt(arg[0]);
            long q = Integer.parseInt(arg[1]);
            double x = p * p + q * q;
            if (Math.sqrt(x) <= d) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
