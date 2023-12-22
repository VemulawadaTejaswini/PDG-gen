import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int l = s.nextInt();
			String[] array = new String[n];
			for (int i = 0; i < n; i++) {
				array[i] = s.next();
			}
			Arrays.sort(array);
			StringBuilder sb = new StringBuilder();
			for (String str : array) {
				sb.append(str);
			}
			System.out.println(sb);
		}
	}
}
