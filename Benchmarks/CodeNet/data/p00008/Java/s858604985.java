import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		ArrayList<Integer> lines = new ArrayList<Integer>();

		try {
			while (null != (s = br.readLine())) {
				lines.add(Integer.valueOf(s));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (Integer n : lines) {
			if (n < 0) {
				continue;
			} else if (n > 36) {
				System.out.println(0);
			} else {
				try {
					int count = 0;
					for (int a = 0; a <= 9; a++) {
						if (n - a > 9 * 3)
							continue;
						for (int b = 0; b <= (n - a) && b <= 9; b++) {
							if (n - a - b > 9 * 2)
								continue;
							for (int c = 0; c <= (n - a - b) && c <= 9; c++) {
								if (n - a - b - c > 9)
									continue;
								count++;
							}
						}
					}
					System.out.println(count);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}

		}
	}
}