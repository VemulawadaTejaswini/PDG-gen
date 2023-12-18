import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double var1 = r * r * Math.PI;
		double var2 = 2 * Math.PI * r;
		String s = " ";
		System.out.printf("%f %f", var1, var2);
	}
}