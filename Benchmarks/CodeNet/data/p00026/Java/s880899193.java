import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] area = new int[10 * 10];

		String str;

		try {
			while ((str = br.readLine()) != null) {
				String strArray[] = str.split(",");
				int x = Integer.parseInt(strArray[0]);
				int y = Integer.parseInt(strArray[1]);
				int size = Integer.parseInt(strArray[2]);

				int point = y * 10 + x;

				switch (size) {
				case 3:
					if (x < 8)
						area[point + 2]++;
					if (x > 1)
						area[point - 2]++;
					if (y < 8)
						area[point + 20]++;
					if (y > 1)
						area[point - 20]++;
				case 2:
					// 左上
					if (x > 0 && y > 0)
						area[point - 11]++;
					// 右上
					if (x < 9 && y > 0)
						area[point - 9]++;
					// 左下
					if (y < 9 && x > 0)
						area[point + 9]++;
					// 右下
					if (y < 9 && x < 9)
						area[point + 11]++;
				case 1:
					if (x < 9)
						area[point + 1]++;
					if (x > 0)
						area[point - 1]++;
					if (y < 9)
						area[point + 10]++;
					if (y > 1)
						area[point - 10]++;
					area[point]++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Arrays.sort(area);
		int blank = 0;
		for (int i = 0; i < 100; i++) {
			if (area[i] != 0) {
				blank = i;
				break;
			}
		}

		// System.out.println(Arrays.binarySearch(area, 1));
		System.out.println(blank);
		System.out.println(area[99]);
	}
}