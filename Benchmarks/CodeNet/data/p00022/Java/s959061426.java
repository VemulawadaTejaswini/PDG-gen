import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while ((n = Integer.parseInt(br.readLine()))!= 0) {
            int S [] = new int [n+1];
            for (int i=0; i<n; i++) {
                S[i] = Integer.parseInt(br.readLine());
            }
            System.out.println(Max(S));
        }
    }
    public static long Max(int S[]) {
        long max = S[0];
        long sum = S[0];
        for (int i=1; i < S.length; i++) {
            if (sum+S[i] >= S[i])  sum+=S[i];
            else sum=S[i];
            if (max<=sum) max = sum;
        }
        return max;
    }
}