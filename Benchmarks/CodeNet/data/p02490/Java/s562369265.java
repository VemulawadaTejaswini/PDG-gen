import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String str = br.readLine();
				String[] nums = str.split(" ", 0);

				int x = Integer.parseInt(nums[0]);
				int y = Integer.parseInt(nums[1]);

				if (x == 0 && y == 0) {
					break;
				}

				if (x > y) {
					System.out.println(y + " " + x);
				} else if (x <= y) {
					System.out.println(x + " " + y);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}