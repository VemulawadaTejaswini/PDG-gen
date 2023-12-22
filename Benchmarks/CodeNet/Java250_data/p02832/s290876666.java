import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int ans = 0;
		int flag = 0;
		int sum = 0;
		int R = 2;
		for(int i=0;i<N;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			if(a[i]==1)
			{
				sum = i;
				flag = 1;
				ans = i;
				break;

			}
		}
		if(flag==0)
		{
			System.out.println(-1);
		}
		else if(flag==1)
		{
			for(int i=ans;i<N;i++)
			{
				if(R==a[i])
				{
					R++;
				}
				else
				{
					sum++;
				}
			}
			System.out.println(sum-1);
		}
	}
}