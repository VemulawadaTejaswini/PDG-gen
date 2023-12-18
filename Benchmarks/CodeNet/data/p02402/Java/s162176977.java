import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long work, n, min, max, sum;
		n = scan.nextInt();
		work = scan.nextInt();
		min = max = sum = work;
		for (int i = 1; i < n; i++) {
			work = scan.nextInt();
			if (min > work) min = work;
			if (max < work) max = work;
			sum += work;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}