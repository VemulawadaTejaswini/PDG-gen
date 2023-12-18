import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int d = (int)(a / b);
		int r = a % b;
		float f = 1.0F * a / b;
		System.out.println(d + " " + r + " " + f);
	}
}