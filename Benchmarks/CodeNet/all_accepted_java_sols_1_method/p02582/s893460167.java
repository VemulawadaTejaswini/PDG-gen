import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();
        String[] strArray = S.split("");

        int result = 0;
        boolean breakFlag = false;

        for(String str : strArray) {
            if ("R".equals(str)) {
                result++;
                breakFlag = true;
            } else if(breakFlag) {
                break;
            }
        }

        pw.println(result);
        br.close();
        pw.close();
    }
}