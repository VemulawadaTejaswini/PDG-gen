import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max, min, mid;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (max < c) {
			mid = max;
			max = c;
		} else if (min > c) {
			mid = min;
			min = c;
		} else {
			mid = c;
		}
		System.out.printf("%d %d %d\n", min, mid, max);
	}

}