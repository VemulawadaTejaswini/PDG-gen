import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a, b, c;
		for(int i=0; i<n; i++){
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			if( a*a + b*b == c*c ||  a*a + c*c == b*b || b*b + c*c == a*a)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}