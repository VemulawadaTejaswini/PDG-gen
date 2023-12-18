import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String line;
            line = br.readLine();
            st = new StringTokenizer(line);
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long r = 1;
            for (int i = 0; i < m; i++) {
                r = r * n;
                if (r >= 1000000007) {
                    r = r % 1000000007;
                }
            }

            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}