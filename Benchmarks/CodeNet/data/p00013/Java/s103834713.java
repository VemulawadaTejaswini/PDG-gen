

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int[] box = new int[101];
		int i = 0, tmp;
		while (scanner.hasNext()) {
			tmp = scanner.nextInt();
			if (tmp == 0) {
				i--;
				System.out.println(box[i]);
			} else {
				box[i] = tmp;
				i++;
			}
		}
		scanner.close();
	}

}

