import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int K = scanner.nextInt();
 		String S = scanner.next();
 		String[] S1 = S.split("");

 		if (K >= S1.length) {
 			for (int j = 0; j < S1.length; j++) {
 	 			System.out.print(S1[j]);
 	 		}
 		} else {
 			for (int j = 0; j < K; j++) {
 	 			System.out.print(S1[j]);
 	 		}
 			System.out.println("...");
 		}
 	}
 }