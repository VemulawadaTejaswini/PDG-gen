import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            int m = n - 1;
            boolean[] ns = new boolean[n + 1];

            for (int i = 2; i < n + 1; i++) {
                for (int j = i; j < n / i + 1; j++) {
                    if (!ns[i * j]) {
                        //System.out.println(i * j);
                        ns[i * j] = true;
                        m--;
                    }
                }
            }
            System.out.println(m);
        }
    }
}