import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count;
		int n;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			count = 0;
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n *= 3;
					n += 1;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}