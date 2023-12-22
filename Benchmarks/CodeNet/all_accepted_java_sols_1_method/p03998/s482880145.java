import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		sc.close();

		int s = 0;
		while(true) {
			if(s == 0) {
				if (A.length() == 0) {
					System.out.println("A");
					return;
				}
				if(A.charAt(0) == 'a') {
					s = 0;
				}else if(A.charAt(0) == 'b') {
					s = 1;
				}else if(A.charAt(0) == 'c') {
					s = 2;
				}
				//先頭文字の除去
				A = A.substring(1, A.length());
			}else if(s == 1) {
				if (B.length() == 0) {
					System.out.println("B");
					return;
				}
				if(B.charAt(0) == 'a') {
					s = 0;
				}else if(B.charAt(0) == 'b') {
					s = 1;
				}else if(B.charAt(0) == 'c') {
					s = 2;
				}
				//先頭文字の除去
				B = B.substring(1, B.length());
			}else if(s == 2) {
				if (C.length() == 0) {
					System.out.println("C");
					return;
				}
				if(C.charAt(0) == 'a') {
					s = 0;
				}else if(C.charAt(0) == 'b') {
					s = 1;
				}else if(C.charAt(0) == 'c') {
					s = 2;
				}
				//先頭文字の除去
				C = C.substring(1, C.length());
			}
		}

	}
}