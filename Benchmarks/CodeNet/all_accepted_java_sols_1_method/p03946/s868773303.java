import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] mins = new int[N];
        int[] maxs = new int[N];

        int curMin = arr[0]; 
        for (int i=0; i<N; i++) {
            curMin = Math.min(curMin,arr[i]);
            mins[i]= curMin;
        }

        int curMax = arr[N-1]; 
        for (int i=N-1; i>=0; i--) {
            curMax = Math.max(curMax,arr[i]);
            maxs[i]= curMax;
        }
        int profit=-1;
        for (int i=0; i<N-1; i++) {
            profit = Math.max(profit, maxs[i+1]-mins[i]);
        }

        if (profit<=0) {
            System.out.println(0);
        }
        else{
            int ans = 0;
            for (int i=0; i<N-1; i++) {
                if(maxs[i+1]-mins[i]==profit){
                    ans++;
                    curMin=mins[i];
                    while(i+1<N && mins[i+1]==curMin)
                        i++;
                }
            }
            System.out.println(ans);
        }

        
    }
}
