import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		int n = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			dice.dc[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 6; j++) {
				dice.dc2[j] = sc.nextInt();
			}
			dice.check();
		}
		System.out.println(dice.result);
	}

}

class Dice {
	public int[] dc = new int[6];
	public int[] dc2 = new int[6];
	private int temp = 0;
	public String result = "Yes";

	void north() {
		temp = dc[0];
		dc[0] = dc[1];
		dc[1] = dc[5];
		dc[5] = dc[4];
		dc[4] = temp;
	}

	void south() {
		temp = dc[0];
		dc[0] = dc[4];
		dc[4] = dc[5];
		dc[5] = dc[1];
		dc[1] = temp;
	}

	void west() {
		temp = dc[0];
		dc[0] = dc[2];
		dc[2] = dc[5];
		dc[5] = dc[3];
		dc[3] = temp;
	}

	void east() {
		temp = dc[0];
		dc[0] = dc[3];
		dc[3] = dc[5];
		dc[5] = dc[2];
		dc[2] = temp;
	}

	void right() {
		temp = dc[1];
		dc[1] = dc[2];
		dc[2] = dc[4];
		dc[4] = dc[3];
		dc[3] = temp;
	}

	void check() {
		for (int i = 0; i <= 3; i++) {
			if (checkAll()) {
				break;
			}
			north();
			for (int j = 0; j <= 3; j++) {
				if (checkAll()) {
					break;
				}
				right();
			}
		}
		for (int j = 0; j <= 3; j++) {
			if (checkAll()) {
				break;
			}
			west();
			for (int i = 0; i <= 3; i++) {
				if (checkAll()) {
					break;
				}
				right();
			}
		}
		if (Arrays.equals(dc, dc2)) {
			result = "No";
		}
	}

	boolean checkAll() {
		if (dc[0] == dc2[0] && dc[1] == dc2[1] && dc[2] == dc2[2] &&
				dc[3] == dc2[3] && dc[4] == dc2[4] && dc[5] == dc2[5]) {
			return true;
		}
		return false;
	}
}

