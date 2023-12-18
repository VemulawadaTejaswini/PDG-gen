import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int C = sc.nextInt();
		final int D = sc.nextInt();
		final int E = sc.nextInt();
		int count = 0;
		int state = A;
		if (state < 0) {
			count = -(A * C);
			state = 0;
		} 
		if (state == 0) {
			count += D;
		} 
		if (0 <= state) {
			count += E * (B - state);
			state = B;
		}
		System.out.println(count);
	}
}

