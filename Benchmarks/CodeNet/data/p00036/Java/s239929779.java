
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			String[] lines = new String[9];
			lines[0] = line;
			for (int i = 1; i < 9; i++) {
				lines[i] = reader.readLine();
			}
			int[] nums = new int[4];
			int count = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (lines[i].charAt(j) == '1') {
						nums[count] = i * 8 + j;
						count++;
						if (count == 4) {
							break;
						}
					}
				}
			}
			int result = nums[3] - nums[0];
			switch (result) {
			case 9:
				System.out.println("A");
				break;
			case 24:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 15:
				System.out.println("D");
				break;
			case 10:
				System.out.println("E");
				break;
			case 17:
				System.out.println("F");
				break;
			default:
				System.out.println("G");
				break;
			}
		}
	}
}