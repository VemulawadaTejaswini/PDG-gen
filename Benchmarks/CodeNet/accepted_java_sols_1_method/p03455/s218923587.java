import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int c = a*b;
		in.close();
		
		if(c%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
