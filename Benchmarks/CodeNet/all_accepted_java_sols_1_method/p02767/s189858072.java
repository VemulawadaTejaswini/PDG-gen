import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner (System.in);
		int n,r,sum=0;
		n=s1.nextInt();
		int[] m=new int[n];
		for(int i=0;i<n;i++)
		{
			m[i]=s1.nextInt();


		}
		Arrays.sort(m);
		int min = n* m[n-1] * m[n-1];
		for(int i = m[0] ; i <= m[n-1] ;i++) 
		{
			int temp = 0;
			for(int j = 0 ; j < n ; j++) 
			{
				temp += Math.pow(i-m[j], 2);
			}
			min = Math.min(temp, min);
		}
		
		System.out.println(min);
	}
}
			