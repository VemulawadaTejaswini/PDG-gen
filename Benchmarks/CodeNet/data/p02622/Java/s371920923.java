import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static String readToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        char[] S = readToken().toCharArray();
        char[] T = readToken().toCharArray();

        int count = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] != T[i]) count++;
        }
        pw.println(count);
        pw.close();
    }
}
