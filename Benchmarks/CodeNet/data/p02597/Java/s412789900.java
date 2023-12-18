import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static String readToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve());
        pw.close();
    }

    private static int solve() throws IOException {
        int N = readInt();
        char[] cs = readToken().toCharArray();

        int count = 0;
        int left = 0;
        int right = N - 1;
        while (left < right) {
            while (left < right && cs[left] != 'W') left++;
            while (right < left && cs[right] != 'R') right--;
            if (left >= right) break;
            else {
                count++;
                left++;
                right--;
            }
        }

        return count;
    }
}
