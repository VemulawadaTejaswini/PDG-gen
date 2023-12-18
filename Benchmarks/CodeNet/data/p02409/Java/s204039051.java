import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noticeNum = scan.nextInt();
		int building1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int building2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int building3[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int building4[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		while (noticeNum > 0) {
			int building = scan.nextInt();
			int floor = scan.nextInt();
			int room = scan.nextInt();
			int number = scan.nextInt();
			room = room + (10 * floor - 10) - 1;
			if (building == 1) {
				building1[room] += number;
			}
			if (building == 2) {
				building2[room] += number;
			}
			if (building == 3) {
				building3[room] += number;
			}
			if (building == 4) {
				building4[room] += number;
			}
			noticeNum--;
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 || i == 7 || i == 11) {
					System.out.print("##");
				} else if (i < 3) {
					System.out.print(" " + building1[j + (10 * i)]);
				} else if (i > 3 && i < 7) {
					System.out.print(" " + building2[j + (10 * i -40)]);
				} else if (i > 7 && i < 11) {
					System.out.print(" " + building3[j + (10 * i -80)]);
				}else if (i > 11) {
					System.out.print(" " + building4[j + (10 * i -120)]);
			}
		}System.out.println("");
	}
}
}
