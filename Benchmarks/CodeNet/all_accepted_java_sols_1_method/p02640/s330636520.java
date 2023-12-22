import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int diff = 4 * X - Y;

        if(diff < 0 || diff % 2 != 0) {
            pw.println("No");
        } else if(diff / 2 <= X) {
            pw.println("Yes");
        } else {
            pw.println("No");
        }

        br.close();
        pw.close();
    }
}