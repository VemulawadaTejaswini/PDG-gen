import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		int max = -2147483648;
		int min =2147483647;
		long sum = 0;

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int [] a = new int[n];

		for (int i = 0; i< n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i<a.length; i++) {
			max = Math.max(max,a[i]);
			min = Math.min(min, a[i]);
			sum += a[i];
		}

		System.out.println(min + " " + max + " "+ sum );

		}
	}
