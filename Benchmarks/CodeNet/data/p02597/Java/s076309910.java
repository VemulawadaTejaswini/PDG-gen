import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String line = stdin.readLine();
        int n = Integer.parseInt(line);
        line = stdin.readLine();
        char[] c = line.toCharArray();

        int start = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (c[i] == 'W' && start == Integer.MAX_VALUE) {
                start = i;
                break;
            }
        }
        int end = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (c[i] == 'R' && end == -1) {
                end = i;
                break;
            }
        }

        int cnt = 0;
        while (start < end) {
            c[start++] = 'R';
            c[end--] = 'W';
            cnt++;

            for (int i = start; i <= end; i++) {
                if (c[i] == 'W') {
                    start = i;
                    break;
                }
            }
            for (int i = end; i >= start + 1; i--) {
                if (c[i] == 'R') {
                    end = i;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
