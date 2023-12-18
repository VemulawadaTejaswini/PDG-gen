import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final DecimalFormat df = new DecimalFormat("0.0000000000");
	static final int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5, G = 6, H = 7,
			I = 8;
	static final int[][] rooms = {
			//
			{ A, D, B, A }, { B, E, C, A }, { C, F, C, B },//
			{ A, G, E, D }, { B, H, F, D }, { C, I, F, E },//
			{ D, G, H, G }, { E, H, I, G }, { F, I, I, H } };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		double[] now = new double[9];
		double[] next = new double[9];
		while ((n = in.nextInt()) > 0) {
			double a = Math.pow(4, n);
			int s = in.next().charAt(0) - 'A';
			now[s] = (int) a;
			int t = in.next().charAt(0) - 'A';// 充電器
			int b = in.next().charAt(0) - 'A';// 入れない
			for (int i = 0; i < n; i++) {
				for (int room = 0; room < 9; room++) {
					double val = now[room] / 4;
					for (int arrow = 0; arrow < 4; arrow++) {
						if (rooms[room][arrow] != b)
							next[rooms[room][arrow]] += val;
						else
							next[room] += val;
					}

				}
				double[] memo = now;
				now = next;
				next = memo;
				Arrays.fill(next, 0);
			}
			System.out.println(df.format(now[t] / a));
		}
	}
}