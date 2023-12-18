import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int e = Integer.parseInt(br.readLine());

			if (e == 0)
				break;

			int m = Integer.MAX_VALUE;
			for (int z = 0; z * z * z <= e; z++) {
				for (int y = 0; y * y <= e - z * z * z; y++) {
					int x = e - y * y - z * z * z;
					m = Math.min(m, x + y + z);
				}
			}
			System.out.println(m);
		}
	}
}
