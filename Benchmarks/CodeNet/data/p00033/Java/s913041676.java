import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		int i = 0;
		int[] str = new int[cnt * 10];
		while (i < cnt * 10) {
			str[i] = in.nextInt();
			i++;
		}

		for (int j = 0; j < cnt; j++) {
			if (hanteiD(str, j * 10, j * 10 + 9))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	static boolean hanteiD(int[] str, int start, int end) {
		int B = 0, C = 0;
		boolean not_result = false;
		for (int j = start; j < end; j++) {
			if (str[j] > B) {
				B = str[j];
				continue;
			} else if (str[j] > C) {
				C = str[j];
				continue;
			} else
				not_result = true;
		}

		if (not_result) {
			B = str[0];
			C = str[1];
			for (int j = start + 2; j < end; j++) {
				if (str[j] > B) {
					B = str[j];
					continue;
				} else if (str[j] > C) {
					C = str[j];
					continue;
				} else
					not_result = true;
			}
		}

		if (not_result)
			return false;
		else
			return true;
	}

}