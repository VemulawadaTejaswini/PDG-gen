import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0; i<n; ++i) {
			sum += scan.nextInt();
		}

		if(sum >= h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}