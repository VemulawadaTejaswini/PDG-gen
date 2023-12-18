import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean[][] need;

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String line = sc.next() + "X";
			char prev = line.charAt(0);
			int count = 1;
			for (int i = 1; i < line.length(); ++i) {
				if (line.charAt(i) != prev) {
					write(prev - '0', count);
					prev = line.charAt(i);
					count = 1;
				} else {
					++count;
				}
			}
			System.out.println();
		}
	}

	static String[] table = { "", "',.!?", "abcABC", "defDEF", "ghiGHI", "jklJKL", "mnoMNO", "pqrsPQRS", "tuvTUV", "wxyzWXYZ" };

	static void write(int key, int count) {
		if (key == 0) {
			for (int i = 0; i < count - 1; ++i) {
				System.out.print(' ');
			}
		} else {
			--count;
			System.out.print(table[key].charAt(count % table[key].length()));
		}
	}

}