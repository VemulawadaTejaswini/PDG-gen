import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sn = new Scanner(System.in)) {
			int x = sn.nextInt();
			double max = 1;
			double tmp = 0;
			LAB:for (int i = 2; i < x; i++) {
				int j = 2;
				while (true) {
					tmp = Math.pow(i, j);
					if (tmp <= x) {
						if (max <= tmp) {
							max = tmp;
						}
						j++;
					} else {
						continue LAB;
					}
				}
			}
			System.out.println((int)max);
		}
	}

}
