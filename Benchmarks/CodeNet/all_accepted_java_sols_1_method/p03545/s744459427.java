import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ABCD = sc.nextLine().toCharArray();
		sc.close();
		int A = Character.getNumericValue(ABCD[0]);
		int B = Character.getNumericValue(ABCD[1]);
		int C = Character.getNumericValue(ABCD[2]);
		int D = Character.getNumericValue(ABCD[3]);
		
		String rt = "";
		boolean isStop = false;
		for (int i = 0; i < 2; i++) {
			boolean isAddA = false;
			int resultA = 0;
			if (i == 1) {
				isAddA = true;
			}
			if (isAddA) {
				resultA = A + B;
			} else {
				resultA = A - B;
			}
			for (int j = 0; j < 2; j++) {
				boolean isAddB = false;
				int resultB = 0;
				if (j == 1) {
					isAddB = true;
				}
				if (isAddB) {
					resultB = resultA + C;
				} else {
					resultB = resultA - C;
				}
				for (int k = 0; k < 2; k++) {
					boolean isAddC = false;
					if (k == 1) {
						isAddC = true;
					}
					int resultC = 0;
					if (isAddC) {
						resultC = resultB + D;
					} else {
						resultC = resultB - D;
					}
					if (resultC == 7) {
						if (isAddA) {
							rt = A + "+";
						} else {
							rt = A + "-";
						}
						if (isAddB) {
							rt = rt + B + "+";
						} else {
							rt = rt + B + "-";
						}
						if (isAddC) {
							rt = rt + C + "+" + D + "=7";
						} else {
							rt = rt + C + "-" + D + "=7";
						}
						isStop = true;
						break;
					}
				}
				if (isStop) {
					break;
				}
			}
			if (isStop) {
				break;
			}
		}
		System.out.println(rt);
	}
}