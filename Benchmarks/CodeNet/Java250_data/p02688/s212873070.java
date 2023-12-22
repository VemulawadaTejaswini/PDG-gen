import java.io.*;
import static java.lang.System.out;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] s = in.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int ans = N;
        boolean[] b = new boolean[N];

        for (int i = 0; i < K; i++) {
            int d = Integer.parseInt(in.readLine());
            s = in.readLine().split(" ");
            for (int j = 0; j < d; j++) {
                int a = Integer.parseInt(s[j]) - 1;
                if (!b[a]) {
                    b[a] = true;
                    ans--;
                }
            }
        }
        
        out.println(ans);
    }
}
