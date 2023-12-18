import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// n日間
		int n = scan.nextInt();

		// 宿題の数
		
		int m = scan.nextInt();

		ArrayList list = new ArrayList();

		for(int i = 0; i < m; i++) {
			list.add(scan.nextInt());
		}

		int s = 0;
		for(int i = 0; i < m; i++) {
			s += (int)list.get(i);
		}

		// 休みより宿題が多い
		if(s > n) {
			// 宿題を終わらせることができない
			System.out.println(-1);
		}else {
			System.out.println(n - s);
		}

	}
}