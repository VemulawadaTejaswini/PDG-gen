import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			if(a > max) {
				max = a;
			}
			if(a < min) {
				min = a;
			}
			sum += a;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}