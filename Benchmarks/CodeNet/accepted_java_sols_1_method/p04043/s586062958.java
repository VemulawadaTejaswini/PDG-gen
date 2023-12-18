import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if (A == 5) {
			if (B == 5 && C == 7) {
				System.out.println("YES");
			} else if (B == 7 && C == 5) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else if (A == 7) {
			if (B == 5 && C == 5) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}

}
