import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		while (A > 0 && C > 0) {
			C -= B;
			if(C<=0) {
				break;
			}
			A -= D;
		}
		if (A <= 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}