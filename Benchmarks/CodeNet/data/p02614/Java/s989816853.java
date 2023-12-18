
import java.util.*;

public class Main {

	public static int i_max;
	public static int j_max;
	public static int field[][];
	public static boolean nurui[];
	public static boolean nuruj[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		i_max = Integer.parseInt(sc.next());
		j_max = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		field = new int[i_max][j_max];
		for (int i = 0; i < i_max; i++) {
			String s = sc.next();
			for (int j = 0; j < j_max; j++) {
				field[i][j] = (s.charAt(j) == '.') ? 0 : 1;
			}
		}

		nurui = new boolean[i_max];
		nuruj = new boolean[j_max];
		int answer = 0;

		for (int i = 0; i < (int) Math.pow(2, i_max); i++) {
			for (int j = 0; j < (int) Math.pow(2, j_max); j++) {

				// 塗りパターンを作る
				String bin_i = String.format("%0" + i_max + "d",
						Integer.valueOf(Integer.toBinaryString(i)));
				String bin_j = String.format("%0" + j_max + "d",
						Integer.valueOf(Integer.toBinaryString(j)));
				for (int p = 0; p < i_max; p++) {
					nurui[p] = (bin_i.charAt(p) == '0') ? false : true;
				}
				for (int p = 0; p < j_max; p++) {
					nuruj[p] = (bin_j.charAt(p) == '0') ? false : true;
				}

				// このパターンで塗ったときの黒マス数は、目標 k と一致するか？
				if (countBlack() == k) {
					answer++;
//					System.out.println(Arrays.toString(nurui));
//					System.out.println(Arrays.toString(nuruj));
//					System.out.println("");
				}

			}
		}

		// 出力
		System.out.println(answer);
		
	}

	// 現在のnurui, nurujで塗ったときの黒マス数
	private static int countBlack() {

		int result = 0;

		for (int i = 0; i < i_max; i++) {
			for (int j = 0; j < j_max; j++) {
				if (!nurui[i] && !nuruj[j] && field[i][j] == 1) {
					result++;
				}
			}
		}
		return result;

	}
}