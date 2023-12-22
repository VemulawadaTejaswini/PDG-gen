import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try (Scanner s = new Scanner(System.in)) {
			int n = 3;
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = s.nextInt();
			}
			Arrays.sort(array);
			System.out.println((array[0] == 5 && array[1] == 5 && array[2] == 7) ? "YES" : "NO");
		}
	}
}
