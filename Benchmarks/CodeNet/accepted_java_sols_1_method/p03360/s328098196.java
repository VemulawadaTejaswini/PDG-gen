import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int max;
		int tmp;
		
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}
		
		tmp = max;
		
		for (int i = 0; i < k; i++) {
			tmp *= 2;
		}
		
		System.out.println(tmp + a + b + c - max);
	}
}