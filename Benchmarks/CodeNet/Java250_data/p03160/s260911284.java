import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static long[] dp;
    private static long cost(int current, int[] arr){
        if(current >= arr.length) return Long.MAX_VALUE;
        if(current == arr.length - 1) return 0;
        if(dp[current] != -1) return dp[current];
        long x = cost(current + 1, arr);
        long y = cost(current + 2, arr);
        if(x != Long.MAX_VALUE) x += Math.abs(arr[current] - arr[current + 1]);
        if(y != Long.MAX_VALUE) y += Math.abs(arr[current] - arr[current + 2]);
        dp[current] = Math.min(x, y);
        return dp[current];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // code goes here
        int n = nextInt(br);
        int[] arr = nextIntArray(br, n);
        dp = new long[n];
        Arrays.fill(dp, -1);
        sb.append(cost(0, arr));
        System.out.print(sb.toString());
    }

    private static int nextInt(BufferedReader br) throws IOException{
        return Integer.parseInt(br.readLine());
    }

    private static int[] nextIntArray(BufferedReader br, int n) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    static class Pair<A, B>{
        A first;
        B second;
        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }
    }
}