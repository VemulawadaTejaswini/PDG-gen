import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();

        Set<String> checkSet = new HashSet<>();
        checkSet.add("A");
        checkSet.add("C");
        checkSet.add("G");
        checkSet.add("T");

        int ans = 0;

        for(int i = 0; i < S.length(); i++) {

            if(!checkSet.contains(S.substring(i, i + 1))) continue;

            int tmp = 1;

            for(int j = i + 1; j < S.length(); j++) {
                String str = S.substring(j, j + 1);
                if(!checkSet.contains(str)) break;
                tmp += 1;
            }

            if(ans < tmp) ans = tmp;
            
        }

        pw.print(ans);
        br.close();
        pw.close();
    }
}