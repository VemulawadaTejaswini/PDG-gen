import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int c = 0;
		while (true) {
			if (A == B && B == C && A == C) {
				break;
			}
			if (A < B && A < C) {
				A += 2;
			} else if (B < A && B < C) {
				B += 2;
			} else if (C < A && C < B) {
				C += 2;
			} else if (A == B) {
				A++;
				B++;
			} else if (B == C) {
				B++;
				C++;
			} else if (A == C) {
				A++;
				C++;
			}
			c++;
		}
		
		System.out.println(c);
	}
}