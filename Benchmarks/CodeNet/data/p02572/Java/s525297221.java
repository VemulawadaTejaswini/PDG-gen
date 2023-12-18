import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long mod = (long)Math.pow(10, 9) + 7;
		long sum = 0;
		int n = scan.nextInt();
		ArrayList<Long> list = new ArrayList<Long>();

		for(int i = 0;i < n;i++) {
			list.add(scan.nextLong());
		}

		for(int i = 0;i < n - 1;i++) {
			for(int j = i + 1;j < n;j++) {
				sum += list.get(i) * list.get(j);
			}
		}

		System.out.println(sum % mod);
	}
}
