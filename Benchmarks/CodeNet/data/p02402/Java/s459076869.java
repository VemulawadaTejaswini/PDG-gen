import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, n, max = -10000, min = 10000, sum = 0;
		n = sc.nextInt();
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			System.out.print(" ");
			if (min > a) {
				min = a;
			}
			if (max < a) {
				max = a;
			}
			sum = sum + a;
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}

