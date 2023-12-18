
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			boolean flag = false;
			int result = -1;
			for (int i = 0; i < 10; i++) {
				String newLine = line.replace("X", String.valueOf(i)).replace(
						"+", "=");
				String[] strs = newLine.split("=");
				long[] num = new long[3];
				for (int j = 0; j < 3; j++) {
					num[j] = Long.parseLong(strs[j]);
				}
				if (num[0] + num[1] == num[2]) {
					result = i;
					break;
				}

			}
			System.out.println(result == -1 ? "NA" : result);
		}
	}
}