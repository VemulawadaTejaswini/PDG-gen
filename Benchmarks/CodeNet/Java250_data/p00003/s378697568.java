import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int[] a = new int[3];
			for(int j=0; j<3; j++)
			{
				a[j] = scanner.nextInt();
			}
			
			for(int j=1; j<3; j++)
			{
				if(a[0] < a[j])
				{
					int buf = a[0];
					a[0] = a[j];
					a[j] = buf;
				}
			}
			System.out.println( (a[0]*a[0]==a[1]*a[1]+a[2]*a[2]) ? "YES" : "NO");
		}
	}
}