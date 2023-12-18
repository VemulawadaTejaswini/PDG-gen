import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int ans = 0;
		
		boolean[] exits = new boolean[100];
		Arrays.fill(exits, false);
		for (int i = a; i < b; i++){
			exits[i] = true;
		}
		for (int i = c; i < d; i++) {
			if (exits[i]) {
				ans++;
			}
		}
		
		System.out.println(ans);
		scanner.close();
	}
}