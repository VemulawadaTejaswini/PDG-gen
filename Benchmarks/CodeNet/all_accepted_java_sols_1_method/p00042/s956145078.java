import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in).useDelimiter("(\\s|,)+");
		int case_ = 0;
		while (in.hasNext()) {
			int w = in.nextInt();
			if (w != 0) {
				System.out.print("Case ");
				System.out.print(++case_);
				System.out.println(":");
				int[] pack = new int[w + 1];
				int n = in.nextInt();
				int maxNum = 0;
				for (int j = 0; j < n; j++) {
					int p = in.nextInt();
					int pw = in.nextInt();
					for (int i = w - pw; i >= 0; i--) {
						pack[i + pw] = Math.max(pack[i + pw], pack[i] + p);
						if (pack[maxNum] <= pack[i + pw]) {
							maxNum = i + pw;
						}
					}
				}
				System.out.println(pack[maxNum]);
				System.out.println(maxNum);
			}
		}
	}
}