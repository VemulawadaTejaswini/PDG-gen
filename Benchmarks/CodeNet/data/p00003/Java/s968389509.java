import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		while(n-- != 0)
		{
			int a = stdIn.nextInt();
			int aa = a * a;
			int b = stdIn.nextInt();
			int bb = b * b;
			int c = stdIn.nextInt();
			int cc = c * c;
			if(aa + bb == cc || aa + cc == bb || bb + cc == aa)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}