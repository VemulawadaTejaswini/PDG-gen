import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt(), A2 = sc.nextInt(), A3 = sc.nextInt();
		sc.close();
		int a1 = Math.abs(A1 - A2), a2 = Math.abs(A2 - A3), a3 = Math.abs(A3 - A1);
		int max = Math.max(a1, Math.max(a2, a3));
		System.out.println(a1 + a2 + a3 - max);
	}
}
