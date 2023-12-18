import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		int max = -2000000000;
		int min = s.nextInt();
		
		for (int i = 1; i < n; i++) {
			int r = s.nextInt();
			max = Math.max(max, r-min);
			min = Math.min(min, r);
		}
		
		System.out.println(max);
	}
}
