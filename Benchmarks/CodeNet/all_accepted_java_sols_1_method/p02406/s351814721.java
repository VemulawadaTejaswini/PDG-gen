import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			boolean is = false;
			for(int j=i; j>0; j/=10)
			{
				if(j%10 == 3)
				{
					is = true;
					break;
				}
			}
			if(i%3 == 0)
			{
				is = true;
			}
			
			if(is)
			{
				System.out.print(" ");
				System.out.print(i);
			}
		}
		System.out.println("");
	}
}