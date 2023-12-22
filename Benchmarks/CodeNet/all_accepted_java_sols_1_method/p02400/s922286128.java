import java.util.Scanner;
import java.util.Formatter;
public class Main
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		Formatter f1 = new Formatter();
		Formatter f2 = new Formatter();
		double r;
		r = inp.nextDouble();
		f1.format("%.6f",r*r*Math.PI);
		f2.format("%.6f",2*r*Math.PI);
		System.out.println(f1 + " " + f2);
	}
}