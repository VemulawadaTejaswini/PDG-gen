import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum;
		
		n = sc.nextInt();
		while (n != 0) {
			sum = 0;
			for (int i = 0; i < n / 4; i++) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
			n = sc.nextInt();
		}
	}
}