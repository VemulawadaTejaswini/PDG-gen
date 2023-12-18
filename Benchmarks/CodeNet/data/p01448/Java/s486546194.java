import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] mins = new int[n];
        int[] maxs = new int[n];
        int[] minBucket = new int[n+1];
        int[] maxBucket = new int[n];
        
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int sPos = str.indexOf(' ');
            mins[i] = Integer.parseInt(str.substring(0, sPos)) - 2;
            maxs[i] = Integer.parseInt(str.substring(sPos + 1)) - 2;
            
            minBucket[Math.min(mins[i], n)]++;
            maxBucket[Math.min(maxs[i], n-1)]++;
        }
        int maxmin = 0;
        int curMaxPeep = 0;
        int curMinPeep = n-1 - minBucket[n];
        for (int i = n-1; i >= 0; i--) {
            curMaxPeep += maxBucket[i];
            curMinPeep -= minBucket[i];
            if (curMinPeep <= i && curMaxPeep <= i) {
                maxmin = i;
                break;
            }
        }
        
        
        System.out.println(maxmin);
        
    }

}