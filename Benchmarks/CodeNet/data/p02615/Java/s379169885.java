import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = sc.nextLine();
		int min =100000001;
		long b= 0;
		long ans = 0;
		for (int i=0; i<a; i++) {
			b = sc.nextLong();
			if (min < b) min = b;
			ans +=b;
		}
		sc.close();
		System.out.println(ans-min);
	}
}
