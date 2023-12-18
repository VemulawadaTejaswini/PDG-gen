import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		int mid = k / 2;

		for(int i = 0; i < n; i++){
			int x = scanner.nextInt();
			count += Math.min(x, Math.abs(x-k));
		}
		System.out.println(count*2);

	}
}