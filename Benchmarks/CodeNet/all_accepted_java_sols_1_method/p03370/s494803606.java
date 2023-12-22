import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int sum = 0;
		int min = 10000;
		for (int i=0; i<n; i++) {
			int m = scanner.nextInt();
			sum += m;
			min = Math.min(m, min);
		}
		System.out.println(n+((x-sum)/min));
	}

}