import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[1000];

		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();

		while (n + m > 0) {
			int best = -1;
			int i;
			int j;

			for (i = 0;i < n;i++) {
				a[i] = sc.nextInt();
			}

			for (i = 0;i < n;++i) {
				for (j = i + 1;j < n;++j) {
					if (a[i] + a[j] <= m && best < a[i] + a[j]) {
						best = a[i] + a[j];
					}
				}
			}

			if (best == -1) {
				System.out.println("NONE");
			} else {
				System.out.println(best);
			}

			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}

