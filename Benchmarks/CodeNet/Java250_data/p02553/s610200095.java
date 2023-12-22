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

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        
        long ans1 = a * c;
        long ans2 = a * d;
        long ans3 = b * c;
        long ans4 = b * d;

        long[] ans_array = {ans1, ans2, ans3, ans4};

        Arrays.sort(ans_array);

        pw.println(ans_array[3]);
        br.close();
        pw.close();
    }
}