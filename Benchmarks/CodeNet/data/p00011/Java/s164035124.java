import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		int[] s = new int[w];
		for (int i = 0; i < w; i++) {
			s[i] = i + 1;
		}
		s[w] = 0;
		for (int j = 0; j < n; j++) {
			int a = scan.nextInt();
			String x = scan.next();
			int b = scan.nextInt();
			s[w] = a;
			s[a - 1] = b;
			s[b - 1] = s[w];
			s[w] = 0;
		}
		for (int k = 0; k < w; k++) {
			System.out.println(s[k]);
		}
	}
}