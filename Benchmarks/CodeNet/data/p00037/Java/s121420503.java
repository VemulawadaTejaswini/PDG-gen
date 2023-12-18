
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();

		String[] a = new String[5];
		String[] b = new String[4];

		for (int i = 0; i < 4; i++) {
			a[i] = reader.readLine();
			b[i] = reader.readLine();
		}
		a[4] = reader.readLine();
		int x = 0;
		int y = 0;
		char direction = 'R';
		while (true) {

			if (direction == 'R') {
				if (x > 0 && b[x - 1].charAt(y) == '1') {
					direction = 'U';
					x--;
				} else if (y < 4 && a[x].charAt(y) == '1') {
					y++;
				} else {
					direction = 'D';
					x++;
				}
			} else if (direction == 'D') {
				if (y < 4 && a[x].charAt(y) == '1') {
					direction = 'R';
					y++;
				} else if (x < 4 && b[x].charAt(y) == '1') {
					x++;
				} else {
					direction = 'L';
					y--;
				}
			} else if (direction == 'L') {
				if (x < 4 && b[x].charAt(y) == '1') {
					direction = 'D';
					x++;
				} else if (y > 0 && a[x].charAt(y - 1) == '1') {
					y--;
				} else {
					direction = 'U';
					x--;
				}
			} else {
				if (y > 0 && a[x].charAt(y - 1) == '1') {
					direction = 'L';
					y--;
				} else if (x > 0 && b[x - 1].charAt(y) == '1') {
					x--;
				} else {
					direction = 'R';
					y++;
				}

			}
			builder.append(direction);
			if (x == 0 && y == 0) {
				break;
			}
			
		}
		System.out.println(builder);
	}
}