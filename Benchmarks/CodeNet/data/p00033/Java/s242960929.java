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
			
			int[] a = new int[10];
			for(int j=1; j<10; j++)
			{
				a[j] = scanner.nextInt();
				if(j == 0)
				{
					b.add(a[j]);
				}
				else {
					if(a[j-1] > a[j])
					{
						c.add(a[j]);
					}
					else {
						b.add(a[j]);
					}
				}
			}
			
			boolean result = true;
			for(int j=1; j<b.size(); j++)
			{
				if(b.get(j-1) > b.get(j))
				{
					result = false;
					break;
				}
			}
			for(int j=1; j<c.size(); j++)
			{
				if(c.get(j-1) > c.get(j))
				{
					result = false;
					break;
				}
			}
			
			System.out.println(result ? "YES" : "NO");
		}
	}
}