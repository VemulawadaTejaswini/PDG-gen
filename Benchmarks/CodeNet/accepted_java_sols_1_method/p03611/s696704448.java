
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int N = scan.nextInt();
		int[] a = new int[N];
		int[] X = new int[100002];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			X[a[i] - 1 + 1]++;
			X[a[i] + 1]++;
			X[a[i] + 1 + 1]++;
		}
		for(int i = 1; i < X.length; i++) {
			max = Math.max(X[i], max);
		}
		System.out.println(max);
		scan.close();

	}

}
