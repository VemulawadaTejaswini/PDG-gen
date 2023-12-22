import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();

		if (N != 100) {
			int baseCount = 1;
			for (int i = 1; i <= D ; i++) {
				baseCount = baseCount * 100;
			}
			System.out.println(baseCount*N);
		} else {
			int result = 0;
			if (D == 0) {
				result = 101;
			} else if(D == 1) {
				result = 10100;
			} else {
				result = 1010000;
			}
			System.out.println(result);
		}
	}
}
