import java.util.Arrays;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int[] a = new int[3];
			int end_count = 0;
			for(int i=0; i<3; i++)
			{
				a[i] = scanner.nextInt();
				if(a[i] == 0)
				{
					end_count ++;
				}
				a[i] /= 2;
			}
			if(end_count == 3)
			{
				break;
			}
			
			Arrays.sort(a);

			int n = scanner.nextInt();
			for(int i=0; i<n; i++)
			{
				int r = scanner.nextInt();
				
				String output = "NA";
				if(r*r > a[0]*a[0]+a[1]*a[1])
				{
					output = "OK";
				}
				System.out.println(output);
			}
			
		}
	}
}