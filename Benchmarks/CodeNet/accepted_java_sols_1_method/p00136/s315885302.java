import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double a[] = new double[n];
		int b[] = new int[7];
		Arrays.fill(b, 0);

		for(int i=0; i<n; i++)
			a[i]=sc.nextDouble();
		for(int i=0; i<n; i++)
		{
			if(a[i]<165.0)
			{
				b[1]++;
				continue;
			}
			else if(a[i]<170.0)
			{
				b[2]++;
				continue;
			}
			else if(a[i]<175.0)
			{
				b[3]++;
				continue;
			}
			else if(a[i]<180.0)
			{
				b[4]++;
				continue;
			}
			else if(a[i]<185.0)
			{
				b[5]++;
				continue;
			}
			else if(a[i]>=185.0)
			{
				b[6]++;
				continue;
			}
		}
		for(int i=1; i<=6; i++)
		{
			System.out.print(i+":");
			for(int j=0; j<b[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}