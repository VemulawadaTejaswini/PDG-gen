import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		int m=(int)x;
		int n=(int)y;
		System.out.print((m/n)+" "+(m%n)+" ");
		System.out.printf("%.8f",x/y);
			
	}
}