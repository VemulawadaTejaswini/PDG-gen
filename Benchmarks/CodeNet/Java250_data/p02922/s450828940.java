import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int count = 0;
		int number = 0;
		do {
			if (B == 1) {
				break;
			}
			
			if (count == 0) {
				number = A;
			} else {
				number += A - 1;
			}
			count ++;
		} while (number < B);
		System.out.println(count);
	}
}