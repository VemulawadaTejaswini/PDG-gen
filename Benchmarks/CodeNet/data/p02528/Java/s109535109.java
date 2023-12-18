import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; i++)
				if (a[i] > a[j]) {
					int k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
		System.out.print(a[0]);
		for (int i = 1; i < a.length; i++)
			System.out.print(" " + a[i]);
		System.out.println();
	}
}