import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int u1 = n/ 500;
		int u2 = (n % 500) /5;
		sc.close();
		System.out.println(u1 *1000 + u2 *5);
	}
}
