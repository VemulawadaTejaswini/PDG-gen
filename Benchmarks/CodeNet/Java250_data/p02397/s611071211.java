import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int a, b;
		Scanner inp = new Scanner(System.in);
		while( true )
		{
			a = inp.nextInt();
			b = inp.nextInt();
			if(a == 0 && b == 0)
				break;
			else {
				if(a > b)
					System.out.println(b + " " + a);
				else
					System.out.println(a + " " + b);
			}
		}
	}
}