import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] a = new int[4];
		char[] c = sc.next().toCharArray();
		for (int i = 0; i < 4; i++) {
			a[i] =Character.getNumericValue(c[i]);
		}
		int[][] op = { { 1, 1, 1 }, { 1, 1, -1 }, { 1, -1, 1 }, { -1, 1, 1 }, { 1, -1, -1 }, { -1, 1, -1 },
				{ -1, -1, 1 },
				{ -1, -1, -1 } };
		String str = "";
		for (int i = 0; i < 8; i++) {
			if (a[0] + a[1] * op[i][0] + a[2] * op[i][1] + a[3] * op[i][2] == 7) {
				str += a[0];
				for (int j = 0; j < 3; j++) {
					if (op[i][j] == 1) {
						str += "+" + a[j + 1];
					} else {
						str += "-" + a[j + 1];
					}
				}
				str += "=7";
				break;
			}
		}
		System.out.println(str);
	}
}
