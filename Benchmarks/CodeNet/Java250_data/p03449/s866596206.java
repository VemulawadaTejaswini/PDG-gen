import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str_raw1[] = br.readLine().split(" ");
        String str_raw2[] = br.readLine().split(" ");
        int[] raw1 = new int[n+1];
        int[] raw2 = new int[n+1];
        raw1[0] = 0;
        raw2[0] = 0;
        for (int i = 1; i <= n; i++) {
            raw1[i] = raw1[i-1] + Integer.parseInt(str_raw1[i-1]);
            raw2[i] = raw2[i-1] + Integer.parseInt(str_raw2[i-1]);
        }
        
        int max = -1, temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = raw1[i] + (raw2[n] - raw2[i-1]);
            max = Math.max(max, temp);
        }
        
        
        System.out.println(max);
    }
}
