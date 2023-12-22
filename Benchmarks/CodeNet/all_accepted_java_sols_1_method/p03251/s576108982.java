import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,m,x,y;
		n=sc.nextInt();
		m=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		int arr_x[] = new int[n];
		int arr_y[] = new int[m];
		for(int i=0;i<n;i++)
			arr_x[i]=sc.nextInt();
		for(int i=0;i<m;i++)
			arr_y[i]=sc.nextInt();
		Arrays.sort(arr_x);
		Arrays.sort(arr_y);
		int z=arr_y[0];
		int flag=0;
		if(z>x&&z<=y)
		{
			if(z>arr_x[n-1])
				flag=1;
		}
		if(flag==0)
			System.out.println("War");
		else
			System.out.println("No War");
	}
}
