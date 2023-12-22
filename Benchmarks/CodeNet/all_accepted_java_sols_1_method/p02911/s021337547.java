import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int A[] = new int[(n < q ? q : n)];
		int AC[] = new int[(n < q ? q : n)];

		for (int i = 0; i < q; i++)
			A[i] = sc.nextInt();
		for (int i = 0; i < (n < q ? q : n); i++)
			AC[i] = k - q;
		for (int i = 0; i < (n < q ? q : n); i++)
			if (i < q)
				AC[A[i] - 1] += 1;
		for (int i = 0; i < n; i++) {
			if (AC[i] <= 0)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}