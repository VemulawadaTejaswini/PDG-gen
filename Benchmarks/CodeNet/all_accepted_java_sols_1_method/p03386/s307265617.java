import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), K = sc.nextInt();
		sc.close();
		for (int i = A; i <= B; i++) {
			if (i < A + K || B - K < i) {
				System.out.println(i);
			}
		}
	}
}
