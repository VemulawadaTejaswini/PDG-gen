import java.util.*;

public class Main {
	int N;
	int base = -1;
	boolean enable;
	int[][] array;

	private Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		in.close();
		int sum = 0;
		for (int i = 1; i < 100000; ++i) {
			sum += i;
			if (sum == N) {
				enable = true;
				base = i - 1;
				break;
			}
			if (sum > N) {
				enable = false;
			}
		}
		if (enable) {
			array = new int[base + 1][base + 1];
			int val = 1;
			for (int i = 0; i < base + 1; ++i) {
				array[0][i] = val;
				array[i][0] = val;
				val += i + 1;
			}
			for (int i = 1; i < base + 1; ++i) {
				for (int j = 1; j <= i; ++j) {
					array[i][j] = array[i][j - 1] + 1;
					array[j][i] = array[j - 1][i] + 1;
				}
			}
			for (int i = 1; i < base + 1; ++i) {
				for (int j = i + 1; j < base + 1; ++j) {
					array[i][j] = array[i - 1][j] + 1;
					array[j][i] = array[j][i - 1] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		if (!ins.enable) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			System.out.println(ins.array.length + 1);
			for (int i = 0; i < ins.array.length; ++i) {
				System.out.print(ins.array[i].length);
				for (int j = 0; j < ins.array[i].length; ++j) {
					System.out.print(" " + ins.array[i][j]);
				}
				System.out.println("");
			}
			System.out.print(ins.array.length);
			for (int i = 0; i < ins.array.length; ++i) {
				System.out.print(" " + ins.array[i][i]);
			}
			System.out.println("");
		}
	}

}