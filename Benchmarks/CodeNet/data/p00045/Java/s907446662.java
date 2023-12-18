import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		float sum = 0;
		int kind = 0;
		for(; scanner.hasNext(); kind++)
		{
			String in = scanner.next();
			String[] w = in.split(",");
			
			total += Integer.parseInt(w[0]) * Integer.parseInt(w[1]);
			sum += Integer.parseInt(w[1]);
		}
		System.out.println(total);
		System.out.println(String.format("%1$d", (int)(sum/kind+0.5)));
	}
}