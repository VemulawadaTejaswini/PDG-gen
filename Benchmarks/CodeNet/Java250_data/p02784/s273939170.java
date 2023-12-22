import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int N = scan.nextInt();
		int sum = 0;
		for (int count = 0; count < N; count++) {
			int x = scan.nextInt();
			sum += x;
			
		}
		if(H <= sum) {
			System.out.println("Yes");

		}
		else {
			System.out.println("No");
		}
	}
}
