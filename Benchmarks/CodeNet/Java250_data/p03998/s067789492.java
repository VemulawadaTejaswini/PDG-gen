import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		char[] C = sc.next().toCharArray();
		char t = A[0];
		int a = 1; int b = 0; int c = 0;
		String res = "";
		while(true) {
			if (t == 'a') {
				if (a == A.length) {
					res = "A";
					break;
				} else {
					t = A[a];
					a++;
				}
			}else if (t == 'b') {
				if (b == B.length) {
					res = "B";
					break;
				} else {
					t = B[b];
					b++;
				}
			}else if (t == 'c') {
				if (c == C.length) {
					res = "C";
					break;
				} else {
					t = C[c];
					c++;
				}
			}
		}
		System.out.println(res);
	}
}
