import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		float min = 1000000;
		float max = -1;
		for(; scanner.hasNext();)
		{
			float h = scanner.nextFloat();
			
			if(h > max)
			{
				max = h;
			}
			if(h < min)
			{
				min = h;
			}
		}
		System.out.println(String.format("%1$.1f", max-min));
	}
}