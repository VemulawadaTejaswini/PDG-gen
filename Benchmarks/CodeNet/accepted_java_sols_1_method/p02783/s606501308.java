import java.util.Scanner;
import java.lang.Math; 

public class Main 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double h= input.nextDouble();
		double a = input.nextDouble();
		int res = (int)Math.ceil(h/a);
		 
		System.out.println(res);
		
	}

}
