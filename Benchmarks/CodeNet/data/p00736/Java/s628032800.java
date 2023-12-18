import java.util.*;

class Main {
	private static String str = null;
	private static boolean satisfy(int p, int q, int r) {
		String formula = str.replaceAll("P", Integer.toString(p))
			.replaceAll("Q", Integer.toString(q))
			.replaceAll("R", Integer.toString(r));
		while (formula.indexOf('-') != -1) {
			formula = formula.replaceAll("-0", "2")
				.replaceAll("-1", "1")
				.replaceAll("-2", "0");
		}
		while (formula.indexOf('+') != -1 || formula.indexOf('*') != -1) {
			formula = formula.replaceAll("\\(0\\+0\\)", "0")
				.replaceAll("\\(0\\+1\\)", "1")
				.replaceAll("\\(0\\+2\\)", "2")
				.replaceAll("\\(1\\+0\\)", "1")
				.replaceAll("\\(1\\+1\\)", "1")
				.replaceAll("\\(1\\+2\\)", "2")
				.replaceAll("\\(2\\+0\\)", "2")
				.replaceAll("\\(2\\+1\\)", "2")
				.replaceAll("\\(2\\+2\\)", "2")
				.replaceAll("\\(0\\*0\\)", "0")
				.replaceAll("\\(0\\*1\\)", "0")
				.replaceAll("\\(0\\*2\\)", "0")
				.replaceAll("\\(1\\*0\\)", "0")
				.replaceAll("\\(1\\*1\\)", "1")
				.replaceAll("\\(1\\*2\\)", "1")
				.replaceAll("\\(2\\*0\\)", "0")
				.replaceAll("\\(2\\*1\\)", "1")
				.replaceAll("\\(2\\*2\\)", "2");
		}
		return formula.equals("2");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (!(str = sc.next()).equals(".")) {
			int count = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						if (satisfy(i, j, k)) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}