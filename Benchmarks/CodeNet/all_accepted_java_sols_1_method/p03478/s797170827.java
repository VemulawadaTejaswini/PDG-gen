
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			int sum1 = 0;
			for (int j = 0; j < s.length(); j++) {
				sum1 += Integer.parseInt(s.substring(j, j + 1));
			}
			if (sum1 >= a && sum1 <= b) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
