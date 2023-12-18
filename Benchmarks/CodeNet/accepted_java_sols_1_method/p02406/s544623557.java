import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int val = Integer.parseInt(br.readLine());
			int x = 0;

			for (int i = 1; i <= val; i++) {
				if (i % 3 == 0) {
					System.out.print(" " + i);
				} else if (i % 10 == 3) {
					System.out.print(" " + i);
				} else {
					x = i / 10;
					while (x != 0) {
						if (x % 10 == 3) {
							System.out.print(" " + i);
							break;
						}
						x /= 10;
					}
				}
			}
			System.out.println();
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}