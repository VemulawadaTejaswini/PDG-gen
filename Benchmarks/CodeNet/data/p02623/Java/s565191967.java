import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int k=in.nextInt();
		long s=0;
		int first[]=new int[n];
		for(int i=0;i<n;i++)
		{
			first[i]=in.nextInt();
			s=s+first[i];
		}
		int second[]=new int[m];
		for(int i=0;i<m;i++)
		{
			second[i]=in.nextInt();
			s=s+second[i];
		}
		if(s<=k)
		{
			System.out.println(n+m);
			return;
		}
		int c=0,i=0,j=0;
		s=0;
		while(k>s)
		{
			if(first[i]<second[j])
			{
				s=s+first[i];
				i++;
			}
			else if(first[i]>second[j])
			{
				s=s+second[j];
				j++;
			}
			else
			{
				s=first[i+1]>=second[j+1] ? s+second[j]:s+first[i];
				if(first[i+1]>=second[j+1])
				{
					j++;
				}
				else
				{
					i++;
				}
			}
			c++;
		}
		System.out.println(c-1);
	}
}