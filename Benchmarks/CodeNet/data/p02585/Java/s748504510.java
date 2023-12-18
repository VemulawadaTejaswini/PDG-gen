import java.util.*;
import java.io.*;
import java.math.*;

class Main
{
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] P = new int[N];
        int[] C = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            P[i] = Integer.parseInt(st.nextToken())-1;
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }

        long ans = Long.MIN_VALUE;

        for (int i=0; i<N; i++) {
            long curSum = 0;
            int k = K;
            int j = P[i];
            while(j!=i) {
                curSum+=C[j];
                j = P[j];
                ans = Math.max(curSum, ans);
                k--;
                if (k==0) {
                    break;
                }
            }
            k--;
            if (k>0 && curSum>0) {
                curSum+=C[i];
                int len = K-k;
                curSum+= curSum*(k/len);
                k=k%len;
                ans = Math.max(curSum, ans);
                j = P[i];
                while(k--!=0){
                    curSum+=C[j];
                    j = P[j];
                    ans = Math.max(curSum, ans);
                }
            }
        }

        out.println(ans);

        out.close();
    }

    

}
