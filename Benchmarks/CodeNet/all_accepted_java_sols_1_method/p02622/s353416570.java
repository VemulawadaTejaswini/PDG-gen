import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] S_Array = st.nextToken().split("");
        st = new StringTokenizer(br.readLine());
        String[] T_Array = st.nextToken().split("");

        int result = 0;

        for(int i = 0; i < S_Array.length; i++) {
            if(!S_Array[i].equals(T_Array[i])) result++;
        }
        
        pw.println(result);
        br.close();
        pw.close();
    }
}