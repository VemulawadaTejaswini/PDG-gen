import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			int[] sides = new int[str.length];
			for (int j = 0; j < str.length; j++) {
				sides[j] = Integer.parseInt(str[j]);
			}
			Arrays.sort(sides);
			if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}