import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		String[] input = new Scanner(System.in).nextLine().split(" ");
		
		float a = Float.parseFloat(input[0]);
		float b = Float.parseFloat(input[1]);
		
		System.out.printf("%1$.6f\n", a*b/3.305785);
	}
}