import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        
        String[] input = br.readLine().split(" ");
        int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(input[i]);
        }
        
        System.out.println(getMinCost(h, K));
    }

    private static int getMinCost(int[] h, int k) {
        int[] cost = new int[h.length];
        
        for (int i = 1; i < h.length; i++) {
            cost[i] = Integer.MAX_VALUE;
            for(int j = k; j > 0; j--) {
                if(i-j < 0) continue;
                cost[i] = Math.min(cost[i], cost[i-j] + Math.abs(h[i] - h[i-j]));
            }
        }

        return cost[h.length-1];
    }
}