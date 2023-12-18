import java.util.*;
import java.math.*;
public class Main {
	
	public static long mod(long x, long m)
	{		
    return (x%m + m)%m;
	}
	
	public static long mul(long a, long b, long div)
	{
		if (a > div/2) {a = a-div;}
		if (b > div/2) {b = b-div;}
		return a*b;

	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		final long div = 1000000007; 
		long ans = 1;
		
		List<Long> l1 = new ArrayList<>();
		List<Long> l2 = new ArrayList<>();
		List<Long> z = new ArrayList<>();
		
		
		for (int i = 0; i < N; i++) {
            long d = sc.nextLong();
			if (d < 0) {l2.add(d);}
			else {l1.add(d);}
		}
		int s1 = l1.size();

		int s2 = l2.size();
		
		if ((s1 == 0) && (K % 2 == 1))
		{
			Collections.sort(l2,Collections.reverseOrder());
			for (int i = 0; i < K; i++)
			{
				ans = mul(ans,l2.get(i),div);
				ans = mod(ans,div);
				
			}
			
			System.out.println(ans);
			return;
		}
		
		
		Collections.sort(l1,Collections.reverseOrder());
		Collections.sort(l2);
		

		
		if ( (K % 2 == 1))
		{
			ans = mul(ans,l1.get(0),div);
			l1.remove(0);
			ans = mod(ans,div);
			K-=1;
		}
		
		
		while (K>1)
		{
			if ((l1.size() > 1) && (l2.size() > 1))
			{
			long mul_1 = l1.get(0)*l1.get(1);
			long mul_2 = l2.get(0)*l2.get(1);
			if ( mul_1 < mul_2 ){
				ans = mul(ans,l2.get(0),div);
				l2.remove(0);
                ans = mod(ans,div);
              
                ans = mul(ans,l2.get(0),div);
				l2.remove(0);
                ans = mod(ans,div);
				}else{
					ans = mul(ans,l1.get(0),div);
				l1.remove(0);
                ans = mod(ans,div);
              
                ans = mul(ans,l1.get(0),div);
				l1.remove(0);
                ans = mod(ans,div);
					}
					ans = mod(ans,div);
					K -= 2;	
             
			}
			else if ((l1.size() < 2) && (l2.size() > 1))
			{
				
				ans = mul(ans,l2.get(0),div);
				l2.remove(0);
				ans = mod(ans,div);
                ans = mul(ans,l2.get(0),div);
				l2.remove(0);
                ans = mod(ans,div);
              
				K -= 2;	
			}
			else if ((l2.size() < 2) && (l1.size() > 1))
			{
				ans = mul(ans,l1.get(0),div);
				l1.remove(0);
				ans = mod(ans,div);
                ans = mul(ans,l1.get(0),div);
				l1.remove(0);
                ans = mod(ans,div);
              
				K -= 2;	
			}
			else
			{
				long mul = l1.get(0)*l2.get(0);
                ans *= l1.get(0);
				l1.remove(0);
				ans = mod(ans,div);
              
                ans *= l2.get(0);
				l2.remove(0);
				ans = mod(ans,div);
				
				System.out.println(ans);
				return;
			}
		}

		System.out.println(ans);

	}
}
