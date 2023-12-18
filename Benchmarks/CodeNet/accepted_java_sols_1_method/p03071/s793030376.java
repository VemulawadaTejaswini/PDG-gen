import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int answer = (a - b > 0) ? a + (a - 1) :
					 (b - a > 0) ? b + (b - 1) :
						 		   a + b;

		System.out.println(answer);
		sc.close();
	}
}