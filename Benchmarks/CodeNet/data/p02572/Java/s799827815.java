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
        String[] input_array = br.readLine().split(" ");

        long result = 0;
        long mod = 1000000000 + 7;


        long sum = 0;
        long calc = 0;

        for(int i = 0; i < N; i++) {
            sum += Long.parseLong(input_array[i]);
            sum = sum % mod;
        }

        for(int i = 0; i < N; i++) {
            calc = Long.parseLong(input_array[i]) % mod;
            sum -= calc % mod;
            result += calc * sum;
            result = result % mod;
        }

        pw.println(result);
        br.close();
        pw.close();
    }
}