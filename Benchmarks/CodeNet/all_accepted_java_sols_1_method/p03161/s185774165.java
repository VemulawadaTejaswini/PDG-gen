import java.io.*;
import java.util.StringTokenizer;

public class Main {
static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
static StringTokenizer st;
static int N,K =0;
static int INF = (int) (1e9+5);
    public static void main(String[] args) throws IOException {
	// write your code here
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr =new int[N];
        for (int i=0;i<N;i++)
            arr[i]  = Integer.parseInt(st.nextToken());
        int [] dp =new int[N];
        for (int i=0;i<N;i++)
            dp[i] = INF;
        dp[0] = 0;
     //   pw.println(INF+1000);
        for (int i=0;i<N;i++){
           for (int j=1;j<=K;j++) {
               int k= j+i;
               if (k<N) {
                   int u = dp[i] + Math.abs(arr[i] - arr[k]);
                   int v = dp[k];
                   //System.out.println(u+ " "+v);
                   dp[k] = Math.min(u, v);
               }
           }

        }
        pw.println(dp[N-1]);
        pw.flush();
    }
}
