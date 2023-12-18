import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int ac = 0, wa = 0, tle = 0, re = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String target = st.nextToken();

            switch (target) {
                case "AC" :
                    ac++;
                    break;
                case "WA" :
                    wa++;
                    break;
                case "TLE" :
                    tle++;
                    break;
                case "RE" :
                    re++;
                    break;
            }  
        }

        pw.println("AC x " + ac);
        pw.println("WA x " + wa);
        pw.println("TLE x " + tle);
        pw.println("RE x " + re);

        br.close();
        pw.close();
    }
}