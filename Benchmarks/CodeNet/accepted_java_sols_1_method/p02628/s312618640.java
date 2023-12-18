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
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] price_array = new int[N];

        int result = 0;

        for(int i = 0; i < N; i++) {
            price_array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(price_array);

        for(int j = 0; j < K; j++) {
            result += price_array[j];
        }
        
        pw.println(result);
        br.close();
        pw.close();
    }
}