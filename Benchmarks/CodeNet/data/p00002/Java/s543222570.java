import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;scanner.hasNext();)
		{
			int c = scanner.nextInt() + scanner.nextInt();
			int s = 0;
			for(; c>0; c/=10, s++);
			
			System.out.println(s+"");
		}
	}
}