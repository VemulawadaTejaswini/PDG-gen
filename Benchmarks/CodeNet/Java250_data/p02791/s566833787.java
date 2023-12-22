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
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i=0 ; i<n ; i++) {
            if(a[i] <= min) {
                min = a[i];
                count++;
            }
        }

        pw.print(count);

        pw.flush();
        pw.close();
    }
}
