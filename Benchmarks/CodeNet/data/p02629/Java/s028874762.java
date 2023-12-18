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
            long n = Long.parseLong(br.readLine());
            StringBuffer sb = new StringBuffer();
            while(n != 0) {
                int x = (int) (n-1) % 26;
                sb.append((char)(x+'a'));
                n = (n-1)/26;
            }
            sb.reverse();
            pw.println(sb);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
