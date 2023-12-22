
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		double A = Integer.parseInt(numbers[0]);
		double B = Integer.parseInt(numbers[1]);
		double C = Integer.parseInt(numbers[2]);
		double D = Integer.parseInt(numbers[3]);

		while(true) {
			C=C-B;
			if(C<=0) {
				break;
			}
			A=A-D;
			if(A<=0) {
				break;
			}
		}

		if(C<=0) {
			System.out.println("Yes");
		}
		if(A<=0) {
			System.out.println("No");
		}

	}
}
