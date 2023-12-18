import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int min = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int x = sc.nextInt();
			if (min >= x) {
				count++;
				min = x;
			}
		}
		sc.close();
		System.out.println(count);

	}
}
