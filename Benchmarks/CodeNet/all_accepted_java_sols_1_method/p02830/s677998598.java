import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;
                PrintWriter pw = new PrintWriter(System.out);

                int n = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());
                char[] c1 = st.nextToken().toCharArray();
                char[] c2 = st.nextToken().toCharArray();
                for(int i=0 ; i<n ; i++) {
                        pw.print(c1[i]);
                        pw.print(c2[i]);
                }


                pw.flush();
                pw.close();
        }
}
