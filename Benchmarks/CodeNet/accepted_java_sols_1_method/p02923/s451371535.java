import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;
		int temp = 0;
		long pre = sc.nextLong();
		long next = 10000000000L;
		for (int i = 0; i < n - 1; i++) {
			next = sc.nextLong();
			if (pre >= next) {
				temp++;
				if (temp >= max) {
					max = temp;
				}
			} else {
				temp = 0;
			}
			pre = next;
		}
		System.out.println(max);
		sc.close();
	}
}
