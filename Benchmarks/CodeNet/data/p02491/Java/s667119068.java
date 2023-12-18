import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		double a1 = (double)a;
		double b1 = (double)b;
		int d = a / b;
		int r = a % b;
		double f = a1 / b1;
		String s = " ";
		System.out.println(d+s+r+s+f);
	}
}