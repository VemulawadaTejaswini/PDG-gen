import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		double d=s.nextDouble();
		double t=s.nextDouble();
		double ss=s.nextDouble();
		
		if(d/ss<=t)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}