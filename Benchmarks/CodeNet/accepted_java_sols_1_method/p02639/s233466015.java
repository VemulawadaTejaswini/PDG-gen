import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int xor = 1^2^3^4^5;
            st = new StringTokenizer(br.readLine());
            xor ^= Integer.parseInt(st.nextToken());
            xor ^= Integer.parseInt(st.nextToken());
            xor ^= Integer.parseInt(st.nextToken());
            xor ^= Integer.parseInt(st.nextToken());
            xor ^= Integer.parseInt(st.nextToken());
            pw.print(xor);

        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
