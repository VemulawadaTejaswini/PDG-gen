import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long[] a = new long[n];
		long[] suml = new long[n];
		long[] sumr = new long[n];
		
		long curs = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			curs+=a[i];
			suml[i] = curs;
		}
		curs = 0;
		for(int i = n-1; i >= 0; i--)
		{
			curs+=a[i];
			sumr[i] = curs;
		}
		
		long score = 0;
		//try take l, r, rest is putting back
		for(int l = 0; l <= n; l++) //take up to n from left
			for(int r = 0; l+r <= k && l+r<=n; r++)
			{
				long toss = k - (l+r);
				long cur = 0;
				if(l>0)cur+=suml[l-1];
				if(r>0)cur+=sumr[n-r];
				
				PriorityQueue<Long> neg = new PriorityQueue<>();
				
				for(int i = 0; i < l; i++)
				{
					if(a[i] < 0)neg.add(a[i]);
				}
				for(int i = 0; i < r; i++)
				{
					int id = n-1-i;
					if(a[id] < 0)neg.add(a[id]);
				}
				
				for(int i = 0; i < toss && !neg.isEmpty(); i++)
				{
					long trash = neg.poll();
					cur -=trash;
				}
				score = Math.max(score, cur);
				
				
			}
		System.out.println(score);
	}

}
