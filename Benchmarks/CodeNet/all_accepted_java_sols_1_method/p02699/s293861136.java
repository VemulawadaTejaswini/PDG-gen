
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		double S = Integer.parseInt(numbers[0]);
		double W = Integer.parseInt(numbers[1]);

		if(S>W) {
			System.out.println("safe");
		}else {
			System.out.println("unsafe");
		}

	}
}
