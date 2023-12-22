import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int grandSum = 0;
		for (int i = 1; i <= N; i++) {
			String s = Integer.toString(i);
			int sum = 0;
			for (char c : s.toCharArray()) {
				sum += (int) (c - '0');
			}
			if (sum >= A && sum <= B) {
				grandSum += i;
			}
		}
		System.out.println(grandSum);
	}
}
