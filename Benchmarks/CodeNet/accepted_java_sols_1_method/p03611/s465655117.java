import java.util.Scanner;

public class Main {

	static int MAX = 100001;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[], count[] = new int[MAX];
		n = sc.nextInt();
		a = new int[n];
		int max2 = 0;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			count[a[i]]++;
			max2 = Math.max(max2,  a[i]);
		}
		sc.close();

		int max = 0, x = 0;
		for (int i = 0; i <= max2; ++i) {
			x = count[i];
			if (i + 1 <= max2)
				x += count[i + 1];
			if (i - 1 >= 0)
				x += count[i - 1];
			max = Math.max(max, x);
		}

		System.out.println(max);
	}

}
