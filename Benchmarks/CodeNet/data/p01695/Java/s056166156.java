import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int data = scanner.nextInt();
			if (data == 0) {
				scanner.close();
				break;
			}

			int[] depth = new int[data];
			String[] line = new String[data];

			int max = 0;
			for (int i = 0; i < data; i++) {
				line[i] = scanner.next();
				String dots = line[i].replaceAll("^(\\.*)[a-z]*", "$1");
				line[i] = line[i].replaceAll("\\.*", "");
				depth[i] = dots.length();
				max = Math.max(max, dots.length());
			}

			boolean[] isDeep = new boolean[max + 1];
			for (int i = line.length - 1; i >= 0; i--) {
				isDeep[depth[i]] = true;
				String rank = "";
				for (int j = 1; j < isDeep.length; j++) {
					if (j < depth[i]) {
						if (isDeep[j]) {
							rank = rank + "|";
						} else {
							rank = rank + " ";
						}
					} else if (j == depth[i]) {
						rank = rank + "+";
					} else if (j > depth[i]) {
						isDeep[j] = false;
					}
				}
				line[i] = rank + line[i];
			}

			for (int i = 0; i < line.length; i++) {
				System.out.println(line[i]);
			}

		}

	}
}