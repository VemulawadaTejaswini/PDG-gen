import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) throws IOException{
		
		int n;
		int A, B;
		int bufA, bufB;
		Scanner scanner = new Scanner(System.in);
		while (true) {		
			n = scanner.nextInt();
			bufA = 0;
			bufB = 0;
			if (n > 0) {
				for (int i = 0; i < n; i++) {
						A = scanner.nextInt();
						B = scanner.nextInt();
						if (A > B) {
							bufA = A + B + bufA;
						} else if (A < B) {
							bufB = A + B + bufB;
						} else {
							bufA = A + bufA;
							bufB = B + bufB;
						}
				}
				System.out.println(bufA + " " + bufB);
			} else {
				break;
			}
		}
	}
}