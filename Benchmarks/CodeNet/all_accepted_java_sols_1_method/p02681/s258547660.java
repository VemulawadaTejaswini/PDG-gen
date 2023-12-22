import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String S = br.readLine();
        String T = br.readLine();

        String tmp = T.substring(T.length() - 1, T.length());

        if(T.equals(S.concat(tmp))) {
            pw.println("Yes");
        } else {
            pw.println("No");
        }

        br.close();
        pw.close();
    }
}