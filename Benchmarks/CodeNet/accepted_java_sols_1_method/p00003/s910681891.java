import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = stdin.nextInt();
			b[i] = stdin.nextInt();
			c[i] = stdin.nextInt();
		}

		for(int i = 0; i < n; i++) {

			if(a[i] * a[i] + b[i] * b[i] == c[i] * c[i]) {
				System.out.println("YES");
			} else if(b[i] * b[i] + c[i] * c[i] == a[i] * a[i]) {

				System.out.println("YES");
			} else if(c[i] * c[i] + a[i] * a[i] == b[i] * b[i]) {
				System.out.println("YES");

			}else {
				System.out.println("NO");

			}


		}
	}
}