
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double S = scan.nextDouble();
		double a = 100;
		int c = 1;
		while(true) {
			a=Math.floor(a*1.01);
			if(S<=a) {
				break;
			}
			c++;
		}
		System.out.println(c);
	}
}
