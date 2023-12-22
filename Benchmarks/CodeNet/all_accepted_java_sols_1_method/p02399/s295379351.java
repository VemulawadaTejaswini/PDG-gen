import java.util.Scanner;
import java.util.Formatter;
public class Main
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		Formatter frm = new Formatter();
		int a, b;
		double c;
		a = inp.nextInt();
		b = inp.nextInt();
		frm.format("%.5f",(double)a/b);
		System.out.println(a/b + " " + a%b + " " + frm);
	}
}