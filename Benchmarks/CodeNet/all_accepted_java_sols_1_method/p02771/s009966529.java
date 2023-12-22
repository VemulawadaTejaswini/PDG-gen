import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();
		if(A == B) {
			if(A == C) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}else if(B == C) {
			if(B == A) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}else if(C == A) {
			if(C == B) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}else {
			System.out.println("No");
		}
	}

}