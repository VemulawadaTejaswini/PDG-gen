import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long l = in.nextLong();
			int[] is = new int[10];
			for (int i = 0; i < 10; i++) {
				is[i] = (int) (l % 10);
				l = l / 10;
			}
			int[] is2 = new int[9];
			while (is.length > 1) {
				is2 = new int[is.length - 1];
				for (int i = 0; i < is2.length; i++) {
					is2[i] = (is[i] + is[i + 1]) % 10;
				}
				is = is2;
			}
			System.out.println(is[0]);
		}
	}
}