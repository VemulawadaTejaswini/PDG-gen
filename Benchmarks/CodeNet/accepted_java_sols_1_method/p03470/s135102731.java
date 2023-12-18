import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ds = new int[n];
        for (int i = 0; i < n; i++) {
            ds[i] = Integer.parseInt(br.readLine());
        }
        
        int[] mochi = new int[105];
        for (int i = 0; i < n; i++) {
            mochi[ds[i]]++;
        }
        
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (mochi[i] > 0) result++;
        }
        System.out.println(result);
    }
}
