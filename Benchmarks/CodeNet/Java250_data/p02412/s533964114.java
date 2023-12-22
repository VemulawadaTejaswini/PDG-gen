import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		List<String> klist = new ArrayList<String>();

		while (true) {
			String line = sc.nextLine();
			klist.add(line);
			if (line.equals("0 0")) {
				break;
			}

		}

		for (String string : klist) {
			if (string.equals("0 0")) {
				break;
			}
			String[] k = string.split(" ");
			int[] v = new int[2];
			v[0] = Integer.parseInt(k[0]);
			v[1] = Integer.parseInt(k[1]);

			int count = 0;
			for (int i = 1; i <= v[0] - 2; i++) {
				for (int j = i + 1; j <= v[0] - 1; j++) {
					for (int j2 = j + 1; j2 <= v[0]; j2++) {
						int sum = i + j + j2;
						if (sum == v[1]) {
							count++;
						}

					}
				}
			}
			System.out.println(count);

		}

	}
}