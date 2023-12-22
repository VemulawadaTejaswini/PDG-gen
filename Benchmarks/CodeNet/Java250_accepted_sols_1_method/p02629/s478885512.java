import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        int position = 26;

        while (n > 0) {
            int letter = (int)((n - 1) % 26 + 1);
            sb.append((char)('a' + letter - 1));
            n -= letter;
            n /= 26;
        }

        bw.write(sb.reverse().toString());
        bw.newLine();

        bw.close();
        br.close();
    }
}
