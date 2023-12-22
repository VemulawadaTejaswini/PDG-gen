import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		for (int i = 1; i < 10; i++) {
			if (N % i == 0 && N / i < 10) {
				a++;
			}
		}
		if (a == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		sc.close();
	}
}
