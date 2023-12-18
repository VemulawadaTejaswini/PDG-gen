import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			train_calc();
		}

	}

	private static void train_calc() {
		String[] strs = sc.nextLine().split(",");
		int[] l_i = new int[10];
		double l_sum = 0.0;
		int v_1 = Integer.parseInt(strs[10]);
		int v_2 = Integer.parseInt(strs[11]);

			for (int i = 0; i < 10; i++) {
				l_i[i] = Integer.parseInt(strs[i]);
				l_sum += l_i[i];
			}

		double t = l_sum / ( v_1 + v_2 );
		double d = v_1 * t;
		int index = 0;

			for (int i = 0; d > 0; i++) {
				d -= l_i[i];
				index = i + 1;
			}

		System.out.println(index);

	}

}

