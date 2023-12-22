import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        if("s".equals(str.substring(str.length()-1, str.length()))) {
            pw.println(str + "es");
        } else {
            pw.println(str + "s");
        }

        br.close();
        pw.close();
    }
}