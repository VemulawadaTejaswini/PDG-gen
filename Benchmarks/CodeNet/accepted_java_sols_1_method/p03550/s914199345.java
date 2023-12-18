
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Z = scan.nextInt();
		int W = scan.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		if(N == 1) {
			System.out.println((int)Math.abs(a[0] - W));
		} else {
			System.out.println((int)Math.max(Math.abs(a[N - 1] - W), Math.abs(a[N - 1 - 1] - a[N - 1])));
		}
		scan.close();

	}

}
