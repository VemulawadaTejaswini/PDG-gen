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
		double d1 = 1.0D * (double)a / (double)b;
		float f = (float)d1;
		String s = " ";
		System.out.println(d + s + r + s + f);
	}
}