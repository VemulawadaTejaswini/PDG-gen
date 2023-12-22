import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		int pt = 0;
		int ph = 0;
		for (int i = 0; i < n; i++) {
			String[] strs = in.nextLine().split(" ");
			String strTaro = strs[0];
			String strHanako = strs[1];
			int diff = strTaro.compareTo(strHanako);
			if (diff == 0) {
				pt++;
				ph++;
			} else if (diff > 0) {
				// win taro
				pt += 3;
			} else {
				ph += 3;
			}
		}
		System.out.printf(String.format("%d %d\n", pt, ph));
	}
}