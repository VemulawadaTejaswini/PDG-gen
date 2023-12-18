import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			ArrayList<Integer> b = new ArrayList<>();
			ArrayList<Integer> c = new ArrayList<>();
			
			int b0=0, c0=0;
			boolean result = true;
			for(int j=0; j<10; j++)
			{
				int a = scanner.nextInt();
				if(j == 0)
				{
					b.add(a);
					b0 = a;
				}
				else {
					if(a > b0)
					{
						b.add(a);
						b0 = a;
					}
					else if(a > c0)
					{
						c.add(a);
						c0 = a;
					}
					else {
						result = false;
					}
				}
			}
			
			System.out.println(result ? "YES" : "NO");
		}
	}
}