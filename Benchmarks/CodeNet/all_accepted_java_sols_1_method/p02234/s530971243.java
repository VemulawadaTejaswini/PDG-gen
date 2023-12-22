import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        String in;
        final int[] m = new int[n+1];
        in = br.readLine();
        m[0] = Integer.parseInt(in.substring(0, in.indexOf(' ')));
        m[1] = Integer.parseInt(in.substring(in.indexOf(' ')+1));
        for(int i = 2; i<=n; i++){
            in = br.readLine();
            m[i] = Integer.parseInt(in.substring(in.indexOf(' ')+1));
        }
        final int[][] cost = new int[n][n+1];
        for(int len = 2; len<=n; len++){
            for(int l = 0; l<=n-len; l++){
                int res = Integer.MAX_VALUE;
                for(int i = 1; i<len; i++){
                    res = Math.min(res, cost[l][i]+m[l]*m[l+i]*m[l+len]+cost[l+i][len-i]);
                }
                cost[l][len] = res;
            }
        }
        System.out.println(cost[0][n]);
    }
}