import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private void solve() throws IOException {
        new Main().solve();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        Random r = new Random();
        int n = Integer.parseInt(f.readLine());
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) {
            char[] seq = f.readLine().toCharArray();
            long firstMultiply = 1000000000;
            boolean passedDot = false;
            for (int j = 0; j < seq.length; j++) {
                if (passedDot) firstMultiply /= 10;
                if (seq[j] == '.') passedDot = true;
            }

            long value = 0;
            for (int j = seq.length - 1; j >= 0; j--) {
                if (seq[j] == '.') continue;
                value += (seq[j] - '0') * firstMultiply;
                firstMultiply *= 10;
            }
            nums[i] = value;
        }

        int[][] atLeast = new int[50][50];
        long pairs = 0;
        for (int i = 0; i < n; i++) {
            int diviedByTwo = 0;
            int dividedByFive = 0;
            while (nums[i] % 2 == 0) {
                diviedByTwo++;
                nums[i] /= 2;
            }
            while (nums[i] % 5 == 0) {
                dividedByFive++;
                nums[i] /= 5;
            }

            pairs += atLeast[Math.max(18 - diviedByTwo, 0)][Math.max(18 - dividedByFive, 0)];

            for (int j = 0; j <= Math.min(18, diviedByTwo); j++) {
                for (int k = 0; k <= Math.min(18, dividedByFive); k++) {
                    atLeast[j][k]++;
                }
            }
        }

        out.println(pairs);
        out.close();
    }
}