import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int[] numA = new int[4];
		int[] numB = new int[4];
		while (sc.hasNext()) {
			int hit = 0;
			int blow = 0;
			for (int i = 0; i < 4; i++) {
				numA[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				numB[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				if (numA[i] == numB[i]) {
					hit++;
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (numA[i] == numB[j]) {
						blow++;
					}
				}
			}
			System.out.println(hit + " " + (blow - hit));
		}

	}

}