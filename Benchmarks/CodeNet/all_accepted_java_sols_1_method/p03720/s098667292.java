import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		int[] counts = new int[n];
		Arrays.fill(counts, 0);
		for (int i = 0; i < m; i++) {
			counts[scanner.nextInt()-1]++;
			counts[scanner.nextInt()-1]++;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}
		
		
		scanner.close();
	}
}