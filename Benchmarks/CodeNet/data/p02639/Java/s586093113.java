import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int x4 = scanner.nextInt();
		int x5 = scanner.nextInt();
		int answer = 0;

		int [] array = new int[]{x1, x2, x3, x4, x5};
		for (int i =0; i < 5; i++) {
			boolean bool = array[i] == 0;
			if (bool == true) {
				if(i == 4) {
					answer = array[i - 1] + 1;
					break;
				} else {
					answer = array[i + 1] - 1;
					break;
				}
			}
		}

		System.out.println(answer);

	}

}