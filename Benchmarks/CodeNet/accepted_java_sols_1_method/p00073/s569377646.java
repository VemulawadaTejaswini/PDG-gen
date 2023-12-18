import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			double x = scanner.nextDouble();
			double h = scanner.nextDouble();
			if(x==0 && h==0)
			{
				break;
			}
			
			System.out.println(String.format("%1$.6f", x*(x + 2*Math.sqrt((x*x)/4 + h*h))));
		}
	}
}