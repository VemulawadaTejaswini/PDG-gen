import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(line[i]);
        }

        int all = 0;
        for (int i: a) {
            all ^= i;
        }
        bw.write(Integer.toString(all ^ a[0]));
        for (int i = 1; i < n; ++i) {
            bw.write(' ');
            bw.write(Integer.toString(all ^ a[i]));
        }

        bw.close();
        br.close();
    }
}
