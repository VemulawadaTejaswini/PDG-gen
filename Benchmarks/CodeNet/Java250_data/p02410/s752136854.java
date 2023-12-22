import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String[] line1b = line1.split(" ");
		int n = Integer.parseInt(line1b[0]);
		int m = Integer.parseInt(line1b[1]);

		String[] all = new String[n + m];

		int[] mm = new int[m];

		for (int i = 0; i < n + m; i++) {
			all[i] = sc.nextLine();
			if (i >= n) {
				mm[i - n] = Integer.parseInt(all[i]);
			}
		}

		int[] nn = new int[m];

		for (int i = 0; i < n; i++) {
			String[] kari = all[i].split(" ");
			int sum = 0;
			for (int j = 0; j < m; j++) {
				nn[j] = Integer.parseInt(kari[j]);
				sum += nn[j] * mm[j];
			}
			System.out.println(sum);
		}
	}

}