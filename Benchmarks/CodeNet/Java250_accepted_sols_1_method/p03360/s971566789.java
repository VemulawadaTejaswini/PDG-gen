
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(sc.nextInt());
		pq.add(sc.nextInt());
		pq.add(sc.nextInt());
		
		int q  = sc.nextInt();
		while(q-->0){
			pq.add(2*pq.poll());
		}
		int ans = 0;
		while(pq.size()>0){
			ans+=pq.poll();
		}
		System.out.println(ans);
		// your code goes here
	}
}