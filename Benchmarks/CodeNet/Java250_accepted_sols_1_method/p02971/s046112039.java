import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int max = 0;
		int maxnum = -1;
		int secmax = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > secmax) {

				if (a[i] > max) {
					secmax = max;
					max = a[i];
					maxnum = i;
				} else {
					secmax = a[i];
				}

			}
//			System.out.println("i:" + i + ", m:" + max + ", s:" + secmax);
		}

		loop: for (int i = 0; i < n; i++) {
			if (max != secmax) {
				if (i == maxnum) {
					System.out.println(secmax);
					continue loop;
				}
			}

			System.out.println(max);
		}

		sc.close();
	}
}