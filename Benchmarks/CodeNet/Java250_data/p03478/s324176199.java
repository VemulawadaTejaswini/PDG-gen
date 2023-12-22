import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		
		for (int i = 0; i <= N; i++) {
			int sum = i / 10000 + (i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10 + i % 10;
			if (sum >= A && sum <= B) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
