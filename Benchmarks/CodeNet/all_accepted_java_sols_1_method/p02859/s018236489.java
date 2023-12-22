import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		scan.close();
		int sum = 0;
		int sum_base = 1;
		int output = 0;
		
		sum = num1 * num1;
		output = sum / sum_base;
		
		System.out.println(output);
		
	}
}
