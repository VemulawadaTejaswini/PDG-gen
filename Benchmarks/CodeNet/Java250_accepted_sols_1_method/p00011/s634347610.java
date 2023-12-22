import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in).useDelimiter(",|\\s+");

		int a,b,t,n;

		n = cin.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++)
		{
			num[i] = i+1;
		}
		
		n = cin.nextInt();
		for(int i=0; i<n; i++)
		{
			a = cin.nextInt();
			b = cin.nextInt();
			
			t=num[a-1]; num[a-1]=num[b-1]; num[b-1]=t;
		}

		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
	}
}