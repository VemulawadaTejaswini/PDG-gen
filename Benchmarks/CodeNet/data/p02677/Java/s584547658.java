import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		double deg = (double)(h+(double)m/60) * 30 - (double)m * 6 ;

		deg = Math.toRadians(deg);

		double acos =  a * Math.cos(deg);
		double asin =  a * Math.sin(deg) ;
		double ans = Math.pow(b - acos, 2) + Math.pow(asin, 2);
		ans = Math.sqrt(ans);

		System.out.println(ans);
	}
}
