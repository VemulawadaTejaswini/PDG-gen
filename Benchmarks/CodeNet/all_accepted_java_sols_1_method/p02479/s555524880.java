import java.util.Scanner;

public class Main
{
	static Scanner s = new Scanner(System.in);

	public static void main(String args[])
	{
		double a = s.nextDouble();

		// 面積
		double m = a * a * Math.PI;
		// 円周の長さ
		double l = 2 * Math.PI * a;

		System.out.println(String.format("%.8f", m) + " " + String.format("%.8f", l));
	}
}