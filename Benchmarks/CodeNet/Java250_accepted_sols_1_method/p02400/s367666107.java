import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		double r=in.nextDouble();
		double pi = 3.1415926535897932384626433 ;
		System.out.printf("%.8f %.8f", r*r*pi,2*r*pi);
		
	}

}