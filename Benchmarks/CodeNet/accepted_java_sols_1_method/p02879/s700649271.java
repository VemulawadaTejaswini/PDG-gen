import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		
		int sum = 0;
		
		if((num1 >= 1 && num1 <=9) && (num2 >= 1 && num2 <=9)) {
			sum = num1 * num2;
		} else sum = -1;
		System.out.println(sum);
	
	}
}
