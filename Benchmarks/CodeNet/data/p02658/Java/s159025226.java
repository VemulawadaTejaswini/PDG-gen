import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		long A = 1;
 		long x = 0;
 		int y = 0;
 		long z = 0;
 		for(int i = 0; i < N; i++) {
 			long B = scanner.nextLong();
 			A *= B;
 		}
 		x = A;
 		z = A;
 		for (int j = 0; j < 18; j++) {
 			x /= 10;
 		}
 		if (x >= 2) {
 			System.out.println("-1");
 		} else if (x < 1){
 			System.out.println(A);
 		} else {
 			for (int j = 0; j < 18; j++) {
 	 			z %= 10;
 	 			//System.out.println(z);
 	 			if (z != 0) {
 	 				y += 1;
 	 			}
 	 		}
 			if (y > 0) {
 				System.out.println("-1");
 			} else {
 				System.out.println(A);
 			}
 		}
 	}
 }