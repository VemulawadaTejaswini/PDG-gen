import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] X = new int[w];
		for (int i = 0; i < X.length; i++) {
			X[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String[] ab = str.split(",");
			int a = Integer.parseInt(ab[0]) - 1;
			int b = Integer.parseInt(ab[1]) - 1;
			int c = X[a];
			X[a] = X[b];
			X[b] = c;
		}
		for (int i = 0; i < X.length; i++) {
			System.out.println(X[i]);
		}
	}
}