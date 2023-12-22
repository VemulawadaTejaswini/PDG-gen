import java.io.*;
import java.util.*;

public class Main{
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
        int N = readInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for (int i = 0; i < N; i++) {
            String verdict = readToken();

            switch (verdict) {
                case "AC":
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;break;
                default:
                    // Impossible
            }
        }

        pw.println("AC x " + ac
                + "\nWA x " + wa
                + "\nTLE x " + tle
                + "\nRE x " + re);
        pw.close();
    }
}
