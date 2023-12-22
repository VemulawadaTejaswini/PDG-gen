import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String S = br.readLine();
        String T = br.readLine();

        int res = T.length();
        for (int i = 0; i <= S.length() - T.length(); i++) {
            int count = 0;
            for (int j = 0; j < T.length(); j++) {
                if (S.charAt(i + j) != T.charAt(j)) count++;
            }
            res = Math.min(res, count);
        }
        System.out.println(res);
    }
}
