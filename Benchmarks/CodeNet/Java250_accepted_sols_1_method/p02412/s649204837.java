import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] lines = br.readLine().split(" ");
            int n = Integer.parseInt(lines[0]);
            int x = Integer.parseInt(lines[1]);
            if (n == 0 && x == 0) {
                break;
            }
            int count = 0;
            int m = 0;
            for (int i = Math.max(1, x - n - (n - 1)); i <= Math.min(n - 2, x / 3); i++) {
                for (int j = Math.max(i + 1, x - n - i); j <= Math.min(n - 1, (x - i) / 2); j++) {
                    int k = x - i - j;
                    if (k <= n && k > j) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}