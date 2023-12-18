import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, i;
		x = sc.nextInt();
		int[] a = new int[x];
		for (i = 0; i < x; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < x; i++) {
			System.out.print(a[x - 1 - i]);
			if (i == x - 1) {
			} else {
				System.out.print(" ");
			}
		}
		sc.close();
	}
}

