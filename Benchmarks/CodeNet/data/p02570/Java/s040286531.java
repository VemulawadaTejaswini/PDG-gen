import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double D = in.nextDouble();
		double T = in.nextDouble();
		double S = in.nextDouble();
		
		if(D / S > T) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}
