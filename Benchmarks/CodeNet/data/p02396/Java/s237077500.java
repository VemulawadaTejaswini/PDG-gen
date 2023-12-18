import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		
		int x=1;
		int i=1;
		while(x!=0)
		{
			x=in.nextInt();
			System.out.println("Case "+ i + ": "+x);
			i++;
		}

	}
}