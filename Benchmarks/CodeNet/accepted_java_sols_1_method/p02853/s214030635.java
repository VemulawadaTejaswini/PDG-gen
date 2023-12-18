import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int A = scanner.nextInt();
 		int B = scanner.nextInt();
 		int sum = 0;
 		if (A == 1) {
 			sum += 300000;
 		} else if (A == 2) {
 			sum += 200000;
 		} else if (A == 3) {
 			sum += 100000;
 		}
 		
 		if (B == 1) {
 			sum += 300000;
 		} else if (B == 2) {
 			sum += 200000;
 		} else if (B == 3) {
 			sum += 100000;
 		}
 		
 		if (A == 1 && B == 1 ) {
 			sum += 400000;
 		}
 		
 		System.out.println(sum);
	}

}
