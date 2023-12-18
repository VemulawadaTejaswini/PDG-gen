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
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            int xor = 0;
            for(int i=0 ; i<n ; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                xor ^= a[i];
            }

            for(int i=0 ; i<n ; i++) {
                pw.print((a[i]^xor) + " ");
            }

        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
