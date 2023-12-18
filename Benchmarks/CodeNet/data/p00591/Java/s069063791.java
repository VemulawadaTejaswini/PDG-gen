import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = ip(br);
            if (n == 0) {
                break;
            }
            int[] big = new int[n];
            int[] small = new int[n];
            int[] columns = ai(br);
            big = columns;
            small[0] = columns[0];
            for (int i : columns) {
                small[0] = Math.min(small[0], i);
            }
            for (int i = 1; i < n; i++) {
                columns = ai(br);
                for (int j = 0; j < n; j++) {
                    big[j] = Math.max(big[j], columns[j]);
                }
                small[i] = columns[0];
                for (int j : columns) {
                    small[i] = Math.min(small[i], j);
                }
            }
            int result = 0;
            out: for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (big[i] == small[j]) {
                        result = big[i];
                        break out;
                    }
                }
            }
            System.out.println(result);
        }

    }

    static int[] ai(BufferedReader br) throws IOException {
        String[] lines;
        lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip(BufferedReader br) throws IOException {
        return Integer.parseInt(br.readLine());
    }
}