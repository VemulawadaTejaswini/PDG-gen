import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int k = scan.nextInt();
		int pos = scan.nextInt();


		// check
		int len = (k - 1) * 2 + 1;
		for(int i = pos - (k - 1); i <= pos + (k - 1); i++){
			System.out.print(i + " ");
		}
		System.out.println("");

	}
}
