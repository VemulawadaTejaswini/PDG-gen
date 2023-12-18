import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st;
		int a, b, c;
		int paper[][];
		int count = 0, max = 0;

		paper = new int[10][10];
		while (sc.hasNext()) {
			a = 0;
			b = 0;
			c = 0;
			st = sc.next();
			count = 0;
			max = 0;
			for (int i = 0; i < st.length(); i++) {
				a *= 10;
				a += st.charAt(i) - '0';
				if (st.charAt(i + 1) == ',') {
					for (int j = i + 2; j < st.length(); j++) {
						b *= 10;
						b += st.charAt(j) - '0';
						if (st.charAt(j + 1) == ',') {
							for (int k = j + 2; k < st.length(); k++) {
								c *= 10;
								c += st.charAt(k) - '0';
							}
							break;
						}
					}
					break;
				}
			}

			paper[a][b]++;
			if (0 <= a - 1) paper[a - 1][b]++;
			if (a + 1 < 10) paper[a + 1][b]++;
			if (0 <= b - 1) paper[a][b - 1]++;
			if (b + 1 < 10) paper[a][b + 1]++;
			if (2 <= c) {
				if (0 <= a - 1 && 0 <= b - 1) paper[a - 1][b - 1]++;
				if (0 <= a - 1 && b + 1 < 10) paper[a - 1][b + 1]++;
				if (a + 1 < 10 && 0 <= b - 1) paper[a + 1][b - 1]++;
				if (a + 1 < 10 && b + 1 < 10) paper[a + 1][b + 1]++;
				if (c == 3) {
					if (0 <= a - 2) paper[a - 2][b]++;
					if (a + 2 < 10) paper[a + 2][b]++;
					if (0 <= b - 2) paper[a][b - 2]++;
					if (b + 2 < 10) paper[a][b + 2]++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (max < paper[i][j]) {
					max = paper[i][j];
				}
				if (paper[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
}