import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			while (n % 2 == 0) {
				n = (n >> 1);
				count++;
			}
		}
		System.out.println(count);
	}
}
