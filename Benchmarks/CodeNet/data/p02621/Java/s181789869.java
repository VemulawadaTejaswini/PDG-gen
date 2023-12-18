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
            long a = Integer.parseInt(br.readLine());
            pw.println(a + a*a + a*a*a);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
