import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();

		for (int i = N; i > 0; i--) {
			if (Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}
}