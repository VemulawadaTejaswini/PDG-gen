import java.util.Scanner;

public class Main {
Scanner in = new Scanner(System.in);

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
		final int val = 18 - Math.abs(18 - in.nextInt());
		int count = 0;
		if (val <= 36 / 2) {
			for (int a = 0; a < 10; a++) {
				if (val >= a) {
					for (int b = 0; b < 10; b++) {
						int ab = a + b;
						if (val >= ab) {
							for (int c = 0; c < 10; c++) {
								int abc = ab + c;
								if (val >= abc) {
									for (int d = 0; d < 10; d++) {
										if ((abc + d) == val) {
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
}