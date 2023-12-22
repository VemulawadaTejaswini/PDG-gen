import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String[] str_array = br.readLine().split(" ");

        long ans = 1;
        long cut = Long.parseLong("1000000000000000000");

        Arrays.sort(str_array);

        for(String str : str_array) {

            if("0".equals(str)) {
                pw.println(0);
                pw.close();
                return;
            }

            if(ans > cut / Long.parseLong(str)) {
                pw.println(-1);
                pw.close();
                return;
            }
            ans *= Long.parseLong(str);
        }

        pw.println(ans);
        br.close();
        pw.close();
    }
}