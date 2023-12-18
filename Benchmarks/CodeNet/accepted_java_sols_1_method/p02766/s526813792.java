import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());

        int count = 0;
        while(n != 0) {
            n /= base;
            count++;
        }

        pw.println(count);
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
