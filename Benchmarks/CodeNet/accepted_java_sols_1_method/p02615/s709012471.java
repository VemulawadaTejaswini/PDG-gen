
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		List<Long> l2 = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
            long d = sc.nextLong();
			l2.add(d);
		}
		Collections.sort(l2,Collections.reverseOrder());
		
		
		Long[] dp = new Long[N];
		for(int i = 0; i < N; i++) 
		{
			dp[i] = (long)0;
		}
		
		for(int i = 0; i < l2.size(); i++) 
		{
			if (i==0) continue;
			dp[i] = dp[i-1] + l2.get(i/2);
			
		}
		
	
		System.out.println(dp[N-1]);
   
        }
		
	}