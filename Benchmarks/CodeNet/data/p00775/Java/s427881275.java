import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int R = sc.nextInt();
			if (R == 0) {
				sc.close();
				break;
			}

			int n = sc.nextInt();
			ArrayList<Integer[]> list = new ArrayList<Integer[]>();
			int[] horizon = new int[41];
			for (int i = 0; i < n; i++) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				int h = sc.nextInt();
				Integer[] put = { l, r, h };
				list.add(put);
				horizon[l + 20]++;
				horizon[r + 20]--;
			}

			boolean covered = true;
			int cover = 0;
			int left = 0;
			int right = 0;
			for (int i = 0; i < horizon.length; i++) {
				cover += horizon[i];
				if (cover == 0 && covered) {
					covered = false;
					left = i - 20;
				} else if (cover >= 1 && !covered) {
					covered = true;
					right = i - 20;
					Integer[] put = { left, right, 0 };
					list.add(put);
				}
			}

			double t = -R;
			double step = 0.001;
			rising: while (true) {
				for (Integer[] bld : list) {
					int l = bld[0];
					int r = bld[1];
					double h = bld[2] - t;

					// 建物が太陽の内側にある時
					if (h * h + l * l < R * R || r * r + h * h < R * R) {
						System.out.println(R + t);
						break rising;
					}
				}
				t += step;
			}
		}
	}
}