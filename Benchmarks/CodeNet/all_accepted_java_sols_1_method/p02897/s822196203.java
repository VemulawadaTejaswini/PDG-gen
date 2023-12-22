import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();

		double total = 0;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				count++;
			}
		}

		System.out.println(count / n);
	}

}