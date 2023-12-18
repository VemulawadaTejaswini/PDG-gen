import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n11 = sc.nextInt();
		int n12 = sc.nextInt();
		int n13 = sc.nextInt();
		int n21 = sc.nextInt();
		int n22 = sc.nextInt();
		int n23 = sc.nextInt();
		int n31 = sc.nextInt();
		int n32 = sc.nextInt();
		int n33 = sc.nextInt();
		boolean b11 = false;
		boolean b12 = false;
		boolean b13 = false;
		boolean b21 = false;
		boolean b22 = false;
		boolean b23 = false;
		boolean b31 = false;
		boolean b32 = false;
		boolean b33 = false;
		int n = sc.nextInt();
		int[] bn = new int[n];

		for (int i = 0; i < n; i++) {
			bn[i] = sc.nextInt();
			if (bn[i] == n11) {
				b11 = true;
			}
			if (bn[i] == n12) {
				b12 = true;
			}
			if (bn[i] == n13) {
				b13 = true;
			}
			if (bn[i] == n21) {
				b21 = true;
			}
			if (bn[i] == n22) {
				b22 = true;
			}
			if (bn[i] == n23) {
				b23 = true;
			}
			if (bn[i] == n31) {
				b31 = true;
			}
			if (bn[i] == n32) {
				b32 = true;
			}
			if (bn[i] == n33) {
				b33 = true;
			}
		}

		if ((b11 == true && b12 == true && b13 == true) || (b21 == true && b22 == true && b23 == true)
				|| (b31 == true && b32 == true && b33 == true) || (b11 == true && b21 == true && b31 == true)
				|| (b12 == true && b22 == true && b32 == true) || (b13 == true && b23 == true && b33 == true)
				|| (b11 == true && b22 == true && b33 == true) || (b13 == true && b22 == true && b31 == true)) {
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}
	}
}
