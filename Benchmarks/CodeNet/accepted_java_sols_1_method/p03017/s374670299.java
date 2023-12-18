import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt() - 1;
		int B = in.nextInt() - 1;
		int C = in.nextInt() - 1;
		int D = in.nextInt() - 1;
		String s = in.next();
		while ((A < N || B < N) && (A != C || B != D)) {
			if (D < C) {
				if (A + 2 < N && s.charAt(A + 2) != '#' && A + 2 != B && A + 2 <= C) {
					A += 2;
				} else if (A + 1 < N && s.charAt(A + 1) != '#' && A + 1 != B && A + 1 <= C) {
					A++;
				} else if (A + 2 == B || A + 1 == B || A == C) {
					if (B + 1 < N && s.charAt(B + 1) != '#' && B + 1 <= D) {
						B++;
					} else if (B + 2 < N && s.charAt(B + 2) != '#' && B + 2 <= D) {
						B += 2;
					} else {
						break;
					}
				} else {
					break;
				}
			} else if (C < D) {
				if (B + 2 < N && s.charAt(B + 2) != '#' && B + 2 != A && B + 2 <= D) {
					B += 2;
				} else if (B + 1 < N && s.charAt(B + 1) != '#' && B + 1 != A && B + 1 <= D) {
					B++;
				} else if (B + 2 == A || B + 1 == A || B == D) {
					if (A + 1 < N && s.charAt(A + 1) != '#' && A + 1 <= C) {
						A++;
					} else if (A + 2 < N && s.charAt(A + 2) != '#' && A + 2 <= C) {
						A += 2;
					} else {
						break;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(A == C && B == D ? "Yes" : "No");
		in.close();
	}
}