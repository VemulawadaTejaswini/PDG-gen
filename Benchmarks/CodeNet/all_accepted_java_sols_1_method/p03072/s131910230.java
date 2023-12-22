import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,sum=0;

		a = sc.nextInt();
		int[] b = new int[a];
		
		for(int i=0;i<a;i++)
		{
			b[i] = sc.nextInt();
		}
		int max = b[0];
		for(int i=0;i<a;i++)
		{
			if(b[i]>=max)
				sum++;
			if(b[i]>max)
				max=b[i];
		}
		
		System.out.println(sum);

	}
}