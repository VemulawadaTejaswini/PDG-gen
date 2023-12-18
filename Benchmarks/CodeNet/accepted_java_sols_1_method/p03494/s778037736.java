import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int min = 10000;
		
		for(int i = 0; i < n; i++)
		{
			
			int a = scan.nextInt();
			int count = 0;
			while(a%2 == 0)
			{
				a = a/2;
				count++;
			}
			if(count < min)min = count;
		}
		System.out.println(min);
		scan.close();
	}
}