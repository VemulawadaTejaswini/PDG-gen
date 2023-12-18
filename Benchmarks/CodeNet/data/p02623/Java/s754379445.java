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
        int M = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        String[] A_array = br.readLine().split(" ");
        String[] B_array = br.readLine().split(" ");
  
        long result = 0;

        X:for(int i = 0; i < N; i++) {

            long A_total = 0;
            long B_total = 0;
            long temp_result = 0;

            for(int j = 0; j <= i; j++) {
                A_total += Long.parseLong(A_array[j]);
                if(A_total > K) break X;
                temp_result += 1;
            }

            for(String str : B_array) {
                B_total += Long.parseLong(str);
                if((A_total + B_total) > K) {
                    break;
                } else {
                    temp_result += 1;
                }
            }

            if(result < temp_result) result = temp_result;

        }
        
        pw.println(result);
        br.close();
        pw.close();
    }
}