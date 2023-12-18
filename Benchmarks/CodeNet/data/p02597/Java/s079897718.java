import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(f.readLine());
        char[] seq = f.readLine().toCharArray();
        int left = 0;
        int right = n - 1;
        int moves = 0;
        while (left < right) {
            if (seq[left] == 'R') {
                left++;
            } else {
                while (right > left && seq[right] == 'W') right--;
                if (seq[right] == 'R') moves++;
                right--;
                left++;
            }
        }

        out.println(moves);
        out.close();
    }
}