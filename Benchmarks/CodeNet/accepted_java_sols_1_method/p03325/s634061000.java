
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Long[] a = new Long[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			
			long count = 0;
			for (long num : a) {
				while (num % 2 == 0) {
					num /= 2;
					count++;
				}
			}
			System.out.println(count);
		}
	}
}