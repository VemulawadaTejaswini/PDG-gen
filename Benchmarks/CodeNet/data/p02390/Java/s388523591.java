import java.io.*;
import java.util.*;

// Solution class
class Solution {
    public Solution() { }
    private static final InputReader scan = new InputReader();
    // solve method
    public void solve() throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        // code goes here...
        int seconds = scan.nextInt();

        int hr = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int sec = (seconds % 3600) % 60;
        out.println(hr + ":" + min + ":" + sec);

        out.close();
    }
}

// InputReader class
class InputReader {
    private final BufferedReader br;
    private StringTokenizer st = new StringTokenizer("");
    public InputReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
    public String next() throws IOException {
        while (!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException ie) { ie.printStackTrace(); }
        }
        return st.nextToken();
    }
    public String nextLine() throws IOException {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException ie) { ie.printStackTrace(); }
        return str;
    }
    public int nextInt() throws IOException { return Integer.parseInt(next()); }
    public long nextLong() throws IOException { return Long.parseLong(next()); }
    public double nextDouble() throws IOException { return Double.parseDouble(next()); }
}

// Main class
public class Main {
    public Main() { }
    // driver method
    public static void main(String[] args) throws IOException {
        new Solution().solve();
    }
}

