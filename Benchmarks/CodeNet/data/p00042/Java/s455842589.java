import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int case_ = 0;
		while (in.hasNext()) {
			int w = in.nextInt();
			if (w != 0) {
				System.out.print("case ");
				System.out.print(++case_);
				System.out.println(":");
				int[] pack = new int[w + 1];
				int n = in.nextInt();
				int maxNum = 0;
				for (int j = 0; j < n; j++) {
					String[] a = in.next().split(",");
					int p = Integer.valueOf(a[0]);
					int pw = Integer.valueOf(a[1]);
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