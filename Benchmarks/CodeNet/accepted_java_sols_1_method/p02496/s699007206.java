import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cardFlags[][] = new boolean[4][13];
		int n, number;
		String mark;
		n = sc.nextInt();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardFlags[i][j] = false;
			}
		}
		
		for (int i = 0; i < n; i++) {
			mark = sc.next();
			number = sc.nextInt();
			if (mark.equals("S")) {
				cardFlags[0][number-1] = true;
			}else if (mark.equals("H")) {
				cardFlags[1][number-1] = true;
			}else if (mark.equals("C")) {
				cardFlags[2][number-1] = true;
			}else if (mark.equals("D")) {
				cardFlags[3][number-1] = true;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (!cardFlags[i][j]) {
					if (i == 0) {
						System.out.printf("S %d\n", j+1);
					}else if (i == 1) {
						System.out.printf("H %d\n", j+1);
					}else if (i == 2) {
						System.out.printf("C %d\n", j+1);
					}else {
						System.out.printf("D %d\n", j+1);
					}
				}
			}
		}
	}

}