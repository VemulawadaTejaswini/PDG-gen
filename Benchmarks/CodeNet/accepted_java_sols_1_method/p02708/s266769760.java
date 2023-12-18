import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                int K = scan.nextInt();
                
                long[] cnt = new long[N+1];
                long ans = 0;
                
                long[] p = new long[N+1];
                long[] q = new long[N+1];
                
                p[0]=0;
                q[0]=N;
                cnt[0]=q[0]-p[0]+1;
                
                for(int i=1; i<=N; i++){
                      p[i] = p[i-1] + i;
                      q[i] = q[i-1] + N-i;
                      cnt[i] = q[i]-p[i]+1;
                }
                
                for(int i=K-1; i<=N; i++){
                ans = ans + cnt[i];
                }
               ans = Math.floorMod(ans,(10*10*10*10*10*10*10*10*10)+7);
                
                System.out.println(ans);
                
	}
}