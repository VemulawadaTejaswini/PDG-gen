
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		double ah = 360D / 12D * ((double)h + (double)m / 60D);
		double am = 360D / 60D * (double)m;


		double vecHX = Math.sin(Math.toRadians(ah)) * (double)a;
		double vecHY = Math.cos(Math.toRadians(ah)) * (double)a;
		double vecMX = Math.sin(Math.toRadians(am)) * (double)b;
		double vecMY = Math.cos(Math.toRadians(am)) * (double)b;

		double d = Math.hypot(Math.abs(vecHX - vecMX), Math.abs(vecHY - vecMY));;

		System.out.println(d);

	}
}

