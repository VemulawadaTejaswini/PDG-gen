import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] d = new int [20];
		int dmax;
		
		dmax = input (d);
		
		for (int i = 0; i < dmax; i++) {
			integration(d[i]);
		}
	}
	
	private static int input (int [] d)
	{
		int i = 0;
		
		Scanner cin = new Scanner (System.in);
		while (cin.hasNext()) {
			d[i] = cin.nextInt();
			i++;
		}
		
		return (i);
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