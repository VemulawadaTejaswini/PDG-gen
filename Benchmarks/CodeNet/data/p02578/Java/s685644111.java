import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A1 = scanner.nextInt();
		int sum = 0;
		int b = A1;
		//System.out.println("bは" + b);
 		for (int i = 0; i < N-1; i++) {
 			int a = scanner.nextInt();
 			//System.out.println("aは" + a);
 			if (a < b) {
 				sum += b-a;
 				//System.out.println("パターン1");
 			} else {
 				b = a;
 				//System.out.println("パターン2");
 			}
 			//System.out.println(sum);
 		}
 	System.out.println(sum);
	}
}