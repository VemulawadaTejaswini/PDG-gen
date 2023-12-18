import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		try {
			ArrayList<int[]> list = toInt();
			for (int[] input : list) {

				System.out
						.print(
								GreatesetCommonDivisor(

										input));
				System.out
						.print(" ");

				System.out
						.println(
								LeastCommonMultiple(
										input));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int GreatesetCommonDivisor(
			int[] input) {
		int f = input[0];
		int s = input[1];

		if (f < s) {
			int w = f;
			f = s;
			s = w;
		}

		int x = f % s;

		while (x != 0) {
			f = s;
			s = x;
			x = f % s;
		}

		return s;
	}

	private static int LeastCommonMultiple(
			int[] input) {

		int x = input[0];
		int y = input[1];
		int modX = 1;
		int modY = 1;
		int i = 2;
		ArrayList<Integer> list = new ArrayList<>();

		while ((i < x
				&& i < y)) {
			modX = x % i;
			modY = y % i;

			if ((modX == 0
					&& modY == 0)) {
				list.add(i);
				x = x / i;
				y = y / i;

				i = 1;
			}
			i++;

		}
		if (list.size() == 0) {
			return 0;
		}

		int reInt = 1;
		for (Integer integer : list) {
			reInt *= integer.intValue();
		}

		return reInt * x * y;

	}

	private static ArrayList<int[]> toInt()
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String s1;
		int[] i2 = new int[2];
		ArrayList<int[]> list = new ArrayList<>();
		StringTokenizer st;
		while ((s1 = br.readLine()) != null
				&& !("".equals(s1))) {
			st = new StringTokenizer(s1);
			i2[0] = Integer.parseInt(st
					.nextToken());
			i2[1] = Integer.parseInt(st
					.nextToken());
			list.add(i2);

		}
		return list;
	}
}