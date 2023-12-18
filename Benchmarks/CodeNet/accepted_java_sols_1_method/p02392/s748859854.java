import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
// 		if ((a >= 0 && a <= 100) && (b >= 0 && b <= 0) && (c >= 0 && c <= 100)) {
			if (a < b && b < c) {
				System.out.println("Yes");
			} else {
				System.out.println("No");			
			}
// 		} else {
// 				System.err.println("Err!");	
// 			return;
// 		}		
	}
}
