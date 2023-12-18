import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int a,b,d,r;
		double f;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		d=a/b;
		r=a%b;
		f=(double)a/(double)b;
		
		System.out.println(d+" "+r+" "+f);
	}
}