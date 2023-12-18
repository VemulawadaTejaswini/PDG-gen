import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			Scanner sc;
			int[] a = new int[4];
			int[] b = new int[4];
			int hit = 0;
			int blow = 0;

			sc = new Scanner(line);
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			sc = new Scanner(br.readLine());
			for (int i = 0; i < b.length; i++) {
				b[i] = sc.nextInt();
			}

			// hit
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					hit++;
					a[i] = -1;// 例外値
				}
			}

			// blow
			for (int i = 0; i < a.length; i++) {
				if (a[i] == -1)
					continue;
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j])
						blow++;
				}
			}

			//
			System.out.println(hit + " " + blow);
		}
	}
}