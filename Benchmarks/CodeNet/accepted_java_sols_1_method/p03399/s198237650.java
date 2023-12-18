import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		sc.close();
		int min1 = Math.min(A, B), min2 = Math.min(C, D);
		System.out.println(min1 + min2);
	}
}
