import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		String ans = "No";
		for (int i= 0; i<=a; i++) {
			if (b == i*2 +(a-i)*4) {
				ans = "Yes";
				break;
			}
		}
		System.out.println(ans);
	}
}
