import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (Math.abs(N-a)<Math.abs(N-b)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

	}
}