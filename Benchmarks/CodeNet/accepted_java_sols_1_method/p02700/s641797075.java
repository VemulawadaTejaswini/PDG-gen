import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		boolean win = true;
		while (true) {
			C -= B;
			if (C <= 0) {
				break;
			}
			A -= D;
			if (A <= 0) {
				win = false;
				break;
			}
		}
		if (win) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
