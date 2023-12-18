import java.util.Scanner;
import java.util.Formatter;
public class Main
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		double r;
		r = inp.nextDouble();
		System.out.println(r*r*Math.PI + " " + 2*r*Math.PI);
	}
}