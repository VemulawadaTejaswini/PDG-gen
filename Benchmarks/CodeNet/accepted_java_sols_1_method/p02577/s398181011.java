import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] N_array = st.nextToken().split("");
        int sum = 0;

        for(String str : N_array) {
            sum += Integer.parseInt(str);
        }
        
        if (sum % 9 == 0) {
            pw.println("Yes");
        } else {
            pw.println("No");
        }

        br.close();
        pw.close();
    }
}