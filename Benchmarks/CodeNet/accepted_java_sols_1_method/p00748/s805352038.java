

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		long[] tet = new long[201];
		long[] tot = new long[1000001];
		long[] totodd = new long[1000001];
		
		long[] odd = new long[201];
		
		int filled = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>();

		int odds = 0;
		for(int i = 0; i <= 200; i++)
		{
			tet[i] = (i * (i+1) * (i+2)) / 6;
			
			if(tet[i] <= 1000000)
			{
				if(tet[i]%2 != 0)
				{
					odd[odds] = tet[i];
					odds++;
					pq2.add((int)tet[i]);
					totodd[(int)tet[i]] = 1;
				}
				
				tot[(int)tet[i]] = 1;
				filled++;
				pq.add((int)tet[i]);
			}
			else
				break;
		}
		
//		System.out.println(Arrays.toString(tet));
//		System.out.println(Arrays.toString(odd));

		
		int curt = 0;
		
		while(!pq.isEmpty())
		{
			int pos = pq.poll();
			
			for(int i = 0; i <= 200; i++)
			{
				if(pos + tet[i] <= 1000000)
				{
					int next = pos + (int)tet[i];
					if(tot[next] == 0 || tot[next] > tot[pos]+1)
					{
						tot[next] = tot[pos]+1;
						pq.add(next);
					}
				}
			}
		}
		while(!pq2.isEmpty())
		{
			int pos = pq2.poll();
			
			for(int i = 0; i <= 200; i++)
			{
				if(pos + odd[i] <= 1000000)
				{
					int next = pos + (int)odd[i];
					if(totodd[next] == 0 || totodd[next] > totodd[pos]+1)
					{
						totodd[next] = totodd[pos]+1;
						pq2.add(next);
					}
				}
			}
		}
//		System.out.println("DONE");
		
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		while(in != 0)
		{
			System.out.println(tot[in] + " " + totodd[in]);
			in = sc.nextInt();
		}
	}

}

