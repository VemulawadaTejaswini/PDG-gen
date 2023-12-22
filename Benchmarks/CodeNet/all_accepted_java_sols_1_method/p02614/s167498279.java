import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int k = sc.nextInt();

			char[][] masu = new char[h][w];
			for (int i = 0; i < h; i++) {
				String line = sc.next();
				for (int j = 0; j < w; j++) {
					masu[i][j] = line.charAt(j);
				}
			}

			int result = 0;

			for (int hBit = 0; hBit < (1 << h); hBit++) {
				ArrayList<Integer> hIndexes = new ArrayList<>();
				for (int i = 0; i < h; i++) {
					if ((1 & hBit >> i) == 1) {
						hIndexes.add(i);
					}
				}

				for (int wBit = 0; wBit < (1 << w); wBit++) {

					ArrayList<Integer> wIndexes = new ArrayList<>();
					for (int i = 0; i < w; i++) {
						if ((1 & wBit >> i) == 1) {
							wIndexes.add(i);
						}
					}

					//ここから処理
					int count = 0;
					for (int i = 0; i < h; i++) {
						for (int j = 0; j < w; j++) {
							if (masu[i][j] == '#' && hIndexes.contains(i) == false && wIndexes.contains(j) == false) {
								count++;
							}
						}
					}
					if (count == k) {
						result++;
					}

					//System.out.println(hBit + " " + wBit + " " + hIndexes.size() + " " + wIndexes.size() + " count:" + count );
				}
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}