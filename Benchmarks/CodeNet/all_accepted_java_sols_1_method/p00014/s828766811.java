import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int d = scanner.nextInt();
			
			int s = 0;
			for(int i=0; i<600; i+=d)
			{
				s += d * (i*i);
			}
			System.out.println(s);
		}
	}
}