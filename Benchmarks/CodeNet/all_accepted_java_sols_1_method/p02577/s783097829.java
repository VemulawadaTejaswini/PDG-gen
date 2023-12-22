import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] cs = br.readLine().toCharArray();

        int ds = 0;
        for (char c : cs) {
            ds += c;
        }
        ds -= cs.length * '0';
        System.out.println(ds % 9 == 0 ? "Yes" : "No");
    }
}
