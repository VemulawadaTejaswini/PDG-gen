import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int d;
		boolean [] f = new boolean [1];
		f[0] = true;
		while (f[0]) {
			d = input (f);
			integration(d);
		}
	}
	
	private static int input (boolean [] f)
	{
		int d;
		
		Scanner cin = new Scanner (System.in);
		d = cin.nextInt();
		f[0] = cin.hasNext();
		return (d);
	}
	
	private static void integration (int d) 
	{
		int end = (600 - d) / d;
		int c = 0;
		
		for (int i = 1; i <= end; i++) {
			c += d * f(i * d);
		}
		
		System.out.println(c);
	}
	
	private static int f (int a) 
	{
		return (a * a);
	}
}