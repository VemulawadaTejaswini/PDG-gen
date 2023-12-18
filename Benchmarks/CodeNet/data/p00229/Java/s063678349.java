import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int b = stdIn.nextInt();
			int r = stdIn.nextInt();
			int g = stdIn.nextInt();
			int c = stdIn.nextInt();
			int s = stdIn.nextInt();
			int t = stdIn.nextInt();
			if(b == 0 && r == 0 && g == 0 && c == 0 && s == 0 && t == 0)
			{
				break;
			}
			int sum = 100;
			sum += 77 * b;
			t -= 6 * b;
			sum += 51 * r;
			t -= 4 * r;
			sum += 4 * g;
			t -= g;
			sum -= c;
			t -= c;
			sum -= s * 3;
			t -= s * 2;
			sum -= 3 * t;
			System.out.println(sum);
		}
	}
}