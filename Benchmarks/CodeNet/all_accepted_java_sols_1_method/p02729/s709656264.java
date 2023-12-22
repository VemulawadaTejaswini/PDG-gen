import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int N;
		int M;
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		N = Integer.parseInt(numbers[0]);
		M = Integer.parseInt(numbers[1]);

		int c = (N*(N-1))/2 + (M*(M-1))/2;
		System.out.println(c);
		
	}
}