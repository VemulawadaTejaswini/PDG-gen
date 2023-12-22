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
            char[] a = br.readLine().toCharArray();
            char[] b = br.readLine().toCharArray();

            int count = 0;
            for(int i=0 ; i<a.length ; i++) {
                if(a[i] != b[i]) count++;
            }

            pw.println(count);
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
