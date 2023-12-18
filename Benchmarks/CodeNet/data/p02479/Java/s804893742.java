import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		double r = stdIn.nextDouble();
		System.out.printf("%.8f %.8f\n", r * r * Math.PI, 2 * r * Math.PI);
	}
}