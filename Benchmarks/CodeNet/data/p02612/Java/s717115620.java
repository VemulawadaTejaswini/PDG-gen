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
            
            int ans = n %= 1000; 
            if(ans != 0) {
                ans = 1000 - ans;
            }
            pw.println(ans);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
