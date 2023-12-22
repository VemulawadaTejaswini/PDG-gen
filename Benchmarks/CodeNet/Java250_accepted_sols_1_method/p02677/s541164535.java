import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();

		int b = stdIn.nextInt();

		int h = stdIn.nextInt();

		int m = stdIn.nextInt();


		double thour = 30 * h + 30 * m / 60.0;

		double mhour = 6 * m;


		double kakudo = (Math.abs(thour - mhour))<180 ?Math.abs(thour - mhour):360-(Math.abs(thour - mhour));
		
	
		double tmp = b * b + a * a - (2 * a * b * Math.cos(Math.toRadians(kakudo))); 

		
		System.out.println(Math.sqrt(tmp));
		
	}

}
