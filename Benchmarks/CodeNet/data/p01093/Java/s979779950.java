

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt();
			if(n == 0) {break;}
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			
			for(int i = 0; i < n; i++)
			{
				pq.add(scan.nextInt());
			}
			
			int ans = 9000000;
			int prev = -999;
			int now = 0;
			
			while(pq.size() > 0)
			{
				now = pq.poll();
				
				if(prev != -999)
				{
					ans = Math.min(ans, Math.abs(prev - now));
				}
				
				prev = now;
			}
			
			System.out.println(ans);
		}
		
	}

}

