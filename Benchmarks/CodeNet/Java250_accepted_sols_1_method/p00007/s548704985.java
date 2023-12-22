import java.util.Scanner;

public class Main 
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int de = 100000;

		for(int i=0; i<n; i++)
		{
			de = de / 100;
			de = de * 105;
			if(de%1000 != 0)
				de += 1000;
			de = de/1000;
			de = de*1000; 
		}
		System.out.println(de);
	}

}