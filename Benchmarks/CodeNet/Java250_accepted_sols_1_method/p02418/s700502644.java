import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			char[] ring = input.readLine().toCharArray();
			char[] pattern = input.readLine().toCharArray();
			boolean flag = false;

			int tmp;
			for (int i = 0; i < ring.length; i++) {
				tmp = i;
				for (int j = 0; j < pattern.length; tmp++, j++) {
					if (tmp == ring.length) {
						tmp = 0;
					}

					if (ring[tmp] != pattern[j]) {
						break;
					} else if (j == pattern.length-1) {
						flag = true;
					}
				}
				if (flag) {
					break;
				}
			}
			System.out.println(flag ? "Yes" : "No");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}