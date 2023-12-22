
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int i;
		int w = scanner.nextInt();
		int n = scanner.nextInt();
		int[] box = new int[w + 1];

		for (i = 0; i < w; i++) {
			box[i + 1] = i + 1;
		}

		for (i = 0; i < n; i++) {
			String str = scanner.next();
			String[] ab = str.split(",");
			int tmp = box[Integer.parseInt(ab[1])];
			box[Integer.parseInt(ab[1])] = box[Integer.parseInt(ab[0])];
			box[Integer.parseInt(ab[0])] = tmp;
		}

		for (i = 0; i < w; i++) {
			System.out.println(box[i + 1]);
		}
		scanner.close();
	}

}

