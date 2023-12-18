import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int total = 0;
		int[] times = new int[n];
		for (int i = 0; i < times.length; i++) {
			times[i] = scanner.nextInt();
			total += times[i];
		}
		
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			int p = scanner.nextInt(), x = scanner.nextInt();
			int ans = total + x - times[p-1];
			System.out.println(ans);
		}
		
		
		
		scanner.close();
	}
}