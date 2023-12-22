import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int s = 0, e = 0;
		
		if (A < C) {
			s = C;
		} else {
			s = A;
		}
		
		if (B < D) {
			e = B;
		} else {
			e = D;
		}
		
		if ((e - s) < 0) {
			System.out.print(0);
		} else {
			System.out.print((e-s));	
		}

		sc.close();
	}
}
