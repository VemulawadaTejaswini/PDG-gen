import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        int l0 = 0;
        int r0 = 1000000000;
        for(int i = 0; i < m; i++) {
            in = br.readLine().split(" ");
            int l = Integer.parseInt(in[0]);
            int r = Integer.parseInt(in[1]);
            l0 = Math.max(l0, l);
            r0 = Math.min(r0, r);
        }

        System.out.println(r0 >= l0? r0 - l0 + 1 : 0);

        br.close();
    }
}