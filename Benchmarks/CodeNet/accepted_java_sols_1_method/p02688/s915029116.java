import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sunukeNum = Integer.parseInt(sc.next());
		int sweetsNum = Integer.parseInt(sc.next());
		int[] sunukeArr = new int[sunukeNum];
		for (int i = 0; i < sunukeNum; i++) {
			sunukeArr[i] = 0;
		}

		for (int i = 0; i < sweetsNum; i++) {
			int hasSweetsNum = Integer.parseInt(sc.next());
			for (int j = 0; j < hasSweetsNum; j++) {
				int sunukeIndex = Integer.parseInt(sc.next());
				sunukeArr[sunukeIndex - 1]++;
			}
		}
		int count = 0;
		for (int sweets : sunukeArr) {
			if (sweets == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
