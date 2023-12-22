import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int N = scanner.nextInt();
 		int count = 0;
 		if (N == 1) {
 			count += 1;
 		}
 		for (int i = 2; i <= 9; i++) {
 			int x = N % i;
 			if (x == 0) {
 				int y = N / i;
 				if (y <= 9) {
 					count += 1;
 					//System.out.println(i);
 					break;
 				}
 			}
 		}
 		if (count > 0) {
 			System.out.println("Yes");
 		} else {
 			System.out.println("No");
 		}
	}
}
