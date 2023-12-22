import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int hour = scan.nextInt();
		int minute = scan.nextInt();

		double rad = Math.PI*2*((double)hour/12.0 + ((double)minute/60.0)/12.0 - (double)minute/60.0);
		double len = (double)(b*b + a*a) - (double)(2*b*a)*Math.cos(rad);

		System.out.printf("%.20f",Math.sqrt(len));
		scan.close();

	}

}
