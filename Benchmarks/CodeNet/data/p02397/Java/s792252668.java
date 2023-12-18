import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int a, b, t;
		Scanner inp = new Scanner(System.in);
		while( true )
		{
			a = inp.nextInt();
			b = inp.nextInt();
			if(a == 0 && b == 0)
				break;
			else {
				t = a;
				a = b;
				b = t;
				System.out.println(a + " " + b);
			}
		}
	}
}