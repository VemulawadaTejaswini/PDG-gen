import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        boolean[] ns = new boolean[1000000];
        for (int i = 2; i < (int) Math.sqrt(1000000); i++) {
            if (ns[i])
                continue;
            for (int j = 2; j < 999999 / i + 1; j++) {
                if (!ns[i * j]) {
                    ns[i * j] = true;
                }
            }
        }

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            int m = 0;
            for (int i = 2; i < n + 1; i++) {
                if (!ns[i]) {
                    m++;
                }
            }
            System.out.println(m);
        }
    }
}