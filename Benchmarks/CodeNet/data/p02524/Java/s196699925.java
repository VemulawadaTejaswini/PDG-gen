import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b, c;
		double another;
		double s, l, h;
		
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();
		
		s = a * b * Math.sin(Math.toRadians(c)) / 2;
		another = a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c));
		another = Math.sqrt(another);
		l = a + b + another;
		h = b * Math.sin(Math.toRadians(c));
		
		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}
}