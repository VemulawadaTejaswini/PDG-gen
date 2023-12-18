import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int d = a / b;
		int r = a % b;
		double f = 1.0D * a / b;
		String s = " ";
		System.out.printf(%d, %d, %f, d, r, f);
	}
}