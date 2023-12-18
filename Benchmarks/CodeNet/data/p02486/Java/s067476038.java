import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if ((n == 0) && (x == 0)) {
				break;
			} else {
				int count = 0;
				for (int i = 1; i < n - 1; i++) {
					for (int j = i + 1; j < n; j++) {
						for (int k = j + 1; k <= n; k++) {
							if (x == i + j + k) {
								count++;
							}
						}
					}
 				}
				System.out.println(count);
			}
		}

	}

}