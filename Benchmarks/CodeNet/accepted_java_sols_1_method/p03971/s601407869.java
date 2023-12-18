import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String s = scanner.next();
		
		int pass=0, orank=0;
		for (int i=1; i<=n; i++)
		{
			if (s.charAt(i-1)=='c')
				System.out.println("No");
			if (s.charAt(i-1)=='a')
			{
				if (pass<a+b)
				{
					System.out.println("Yes");
					pass++;
				}
				else {
					System.out.println("No");
				}
			}
			if (s.charAt(i-1)=='b')
			{
				orank++;
				if (pass<a+b && orank <= b)
				{
					System.out.println("Yes");
					pass++;
				}
				else {
					System.out.println("No");
				}
			}
			
		}
	}
}