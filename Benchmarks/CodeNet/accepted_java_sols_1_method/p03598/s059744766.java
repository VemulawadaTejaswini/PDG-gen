import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] x = new int[n];
		int move = 0;
		int i = 0;
		for(i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			int x_k = x[i] - k;
			if(x_k < 0) {
				x_k = x_k * (-1);
			}
			if(x_k >= x[i]) {
				move = move + (2 * x[i]);
			} else {
				move = move + (2 * x_k);
			}
		}
		System.out.println(move);
	}
}