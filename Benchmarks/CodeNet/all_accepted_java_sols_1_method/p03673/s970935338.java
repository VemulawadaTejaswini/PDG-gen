import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[n + 1];
		int index = n / 2 + 1;
		boolean add;
		if(n % 2 == 0) {
			add = false;
		} else {
			add = true;
		}

		for(int i = 1; i <= n; i++) {
			b[index] = a[i];
			if(add) {
				index += i;
				add = false;
			}
			else {
				index -= i;
				add = true;
			}
		}

		for(int i = 1; i <= n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}
