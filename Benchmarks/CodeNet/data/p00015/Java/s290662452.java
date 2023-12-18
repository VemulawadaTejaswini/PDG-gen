import java.util.Scanner;
import java.math.BigInteger;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			BigInteger a = new BigInteger(sc.nextLine());
			BigInteger b = a.add(new BigInteger(sc.nextLine()));
			System.out.println(b.toString());
		}
	}
}