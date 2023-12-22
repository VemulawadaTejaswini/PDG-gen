import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		ArrayList<String> lines = new ArrayList<String>();
		int in = 0;

		while (true) {
			String string = sc.nextLine();

			if (string.equals("0 0")) {
				break;
			}
			lines.add(string);
			in++;
		}

		for (int i = 0; i < in; i++) {
			int answer = 0;
			String[] kari = lines.get(i).split(" ");
			int n = Integer.parseInt(kari[0]);
			int x = Integer.parseInt(kari[1]);

			for (int j = 1; j <= n - 2; j++) {
				for (int k = j + 1; k <= n - 1; k++) {
					for (int l = k + 1; l <= n; l++) {
						if (j + k + l == x) {
							answer++;
						}
					}

				}

			}
			
			System.out.println(answer);

		}
	}

}