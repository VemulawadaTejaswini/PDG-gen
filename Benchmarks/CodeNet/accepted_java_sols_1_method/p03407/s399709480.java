import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		sc.close();
		if (A + B >= C) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
