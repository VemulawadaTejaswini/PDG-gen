import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] x = new int[100000];
		int[] y = new int[100000];
		int[] c = new int[100000];

		Scanner scan = new Scanner(System.in);
		int aa = scan.nextInt();
		int bb = scan.nextInt();
		int mm = scan.nextInt();

		for (int i=0; i<aa; i++) {
			a[i] = scan.nextInt();
		}

		for (int i=0; i<bb; i++) {
			b[i] = scan.nextInt();
		}

		for (int i=0; i<mm; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		scan.close();
		int ans = 1000000;
		int minA = 100001;
		int minB = 100001;

		for (int i=0; i<aa; i++) {
			if (a[i] < minA) {
				minA = a[i];
			}
		}
		for (int i=0; i<bb; i++) {
			if (b[i] < minB) {
				minB = b[i];
			}
		}
		ans = minA + minB;

		for (int i=0; i<mm; i++) {
			if (a[x[i]-1] +b[y[i]-1] - c[i] < ans) {
				ans = a[x[i]-1] + b[y[i]-1] - c[i];
			}
		}

		System.out.println(ans);
	}
}