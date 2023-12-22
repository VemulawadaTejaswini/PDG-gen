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
            for (int i = 1; i < n - 1; i++) {
                if (i * 3 + 2 > x) {
                    break;
                }
                for (int j = i + 1; j < n; j++) {
                    if (i + j + j + 1 > x) {
                        break;
                    }
                    for (int k = x - i - j; k >= j + 1; k--) {
                        if (k > n) {
                            continue;
                        }
                        if (i + j + k == x) {
                            count++;
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}