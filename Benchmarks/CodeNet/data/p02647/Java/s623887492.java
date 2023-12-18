import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static int[] solve(int N, int K, int[] A){
        int[] ans = new int[N];
        for(int n=0; n<N; n++) ans[n] = A[n];

        int[] max = new int[N];
        Arrays.fill(max, N);
        for(int k=0; k<K; k++){
            int[] next = new int[N];
            Arrays.fill(next, 0);
            for(int n=0; n<N; n++){
                for(int m = n-ans[n]; m <= n+ans[n]; m++) {
                    if(0 <= m && m < N) next[m]++;
                }
            }
            ans = next;
            if(Arrays.equals(ans,max)){
                break;
            } 
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();

        int[] ans = solve(N,K,A);
        for(int n=0; n<N-1; n++) System.out.print(ans[n] + " "); System.out.println(ans[N-1]);
        
    }
}
