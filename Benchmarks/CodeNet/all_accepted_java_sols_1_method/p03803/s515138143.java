import java.util.*;

public class Main {
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == B) {
			System.out.println("Draw");
			return;
		}
		if(A >= 2 && B >= 2 && A > B) {
			System.out.println("Alice");
			return;
		}
		if(A>=2 && B >= 2 && A < B) {
			System.out.println("Bob");
			return;
		}
		if(A == 1) {
			System.out.println("Alice");
			return;
		}
		if(B == 1) {
			System.out.println("Bob");
		}
	}

}
