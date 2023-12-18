import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int count = 0;
		while(C > 0 && A > 0) {
			C = C - B;
			//System.out.println("Cは" + C);
			if(C <= 0) {
				count += 1;
				break;
			}
			A = A - D;
			//System.out.println("Aは" + A);
			if (A <= 0) {
				count -= 1;
				break;
			}
		}
		if (count >= 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
