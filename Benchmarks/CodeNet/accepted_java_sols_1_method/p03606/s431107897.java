import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int p = 0;
		
		for(int i = 0; i < n; i++)
		{
			int l = scan.nextInt();
			int r = scan.nextInt();
			 p += r - l + 1;
		}
		
		System.out.println(p);

		scan.close();
	}
}
