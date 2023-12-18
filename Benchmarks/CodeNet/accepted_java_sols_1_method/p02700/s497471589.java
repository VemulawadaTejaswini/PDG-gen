import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());

		int t = A / D;
		if (A % D != 0) {
			t++;
		}
		int a = C / B;
		if (C % B != 0) {
			a++;
		}
		if (a - 1 < t) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
