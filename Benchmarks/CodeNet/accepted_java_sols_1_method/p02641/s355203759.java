import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0 ; i<n ; i++) {
                int u = Integer.parseInt(st.nextToken());
                hs.add(u);
            }

            int l = x;
            int r = x;
            while(hs.contains(l)) l--;
            while(hs.contains(r)) r++;
            if(x-l <= r-x) {
                pw.print(l);
            }
            else {
                pw.print(r);
            }
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
}
