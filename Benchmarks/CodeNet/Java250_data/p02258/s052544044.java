import java.util.Scanner;

public class Main {

	/**
	 * それぞれの購入地点から得られる最大利ざやを求め、 最も利益の大きい値を出力する
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] value = new int[num];
		for (int i = 0; i < num; i++) {
			value[i] = scan.nextInt();
		}

		System.out.println(ExchangeMax(value));

		scan.close();
	}

	/**
	 * 為替の最小値と最大値を見つけ、その差を最大利ざやとする。
	 * 
	 * @param value
	 *            為替レート
	 * @return 最大利ざや
	 */
	static int ExchangeMax(int[] value) {
		int max = Integer.MIN_VALUE;
		int min = value[0];
		for (int i = 1; i < value.length; i++) {
			max = Math.max(max, value[i] - min);
			min = Math.min(min, value[i]);
		}
		return max;
	}

}

