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
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			if (str1.length() > 80 || str2.length() > 80)
				System.out.println("overflow");
			else
			{
				BigInteger a = new BigInteger(str1);
				BigInteger b = a.add(new BigInteger(str2));
				String str3 = b.toString();
				if (str3.length() > 80)
					System.out.println("overflow");
				else System.out.println(b.toString());
			}
		}
	}
}