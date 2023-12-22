import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        String S = br.readLine();

        if(S.length() > K) {
            String tmp = S.substring(0, K);            
            pw.println(tmp + "...");
        } else {
            pw.println(S);
        }
       
        br.close();
        pw.close();
    }
}