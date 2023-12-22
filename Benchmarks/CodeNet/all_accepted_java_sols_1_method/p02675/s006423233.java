import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int digit = 0;
		
		if (N >= 10) {
			digit = N % 10;
		}else {
			digit = N;
		}
		
		if (digit == 3) {
			System.out.println("bon");
		}else if (digit == 0 || digit == 1 || digit == 6 || digit == 8) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}
}