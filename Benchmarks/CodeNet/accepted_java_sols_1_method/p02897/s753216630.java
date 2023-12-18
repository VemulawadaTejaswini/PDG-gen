import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	    double num1 = scan.nextInt();
		scan.close();
		
			if (num1 % 2 != 0) {
				double num2 = (int) Math.ceil(num1 / 2);
				double output_odd = num2 / num1;
				System.out.println(output_odd);
			} else {
			double output = (num1 / 2) / num1;
			System.out.println(output);
			}
		}
}
