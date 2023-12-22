import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(in[i]);
        }
        int[] ans = new int[n];
        for (int i = 0; i < m; i++) {
            in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]) - 1;
            int b = Integer.parseInt(in[1]) - 1;
            if (h[a] < h[b]) {
                ans[a] = -1;
            } else if (h[a] > h[b]) {
                ans[b] = -1;
            } else {
                ans[a] = -1;
                ans[b] = -1;
            }
        }

        br.close();

        int cnt = 0;
        for (int a : ans) {
            if (a != -1) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();

    }
}