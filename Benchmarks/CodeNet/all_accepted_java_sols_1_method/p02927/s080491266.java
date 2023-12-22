import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		String[] lines = line.split(" ");

		int M = Integer.parseInt(lines[0]);
		int D = Integer.parseInt(lines[1]);

		int ans = 0;

		for (int i = 22; i <= D; i++) {
			String[] strD = String.valueOf(i).split("");
			if (Integer.parseInt(strD[0]) < 2 || Integer.parseInt(strD[1]) < 2)
				continue;
			int compare = Integer.parseInt(strD[0]) * Integer.parseInt(strD[1]);

			for (int j = 1; j <= M; j++) {
				if (j == compare) {
					ans++;
				}
			}
		}

		System.out.println(ans);

	}

}
