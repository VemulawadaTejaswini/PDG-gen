import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int frontNum = scanner.nextInt();
			int sideNum = scanner.nextInt();
			if (frontNum == 0) {
				scanner.close();
				break;
			}

			// 優先度つきキュー（小さい方から出てくる
			PriorityQueue<Integer> front = new PriorityQueue<Integer>();
			PriorityQueue<Integer> side = new PriorityQueue<Integer>();

			for (int i = 0; i < frontNum; i++) {
				front.add(scanner.nextInt());
			}

			for (int i = 0; i < sideNum; i++) {
				side.add(scanner.nextInt());
			}

			int ans = 0;
			while (!front.isEmpty() || !side.isEmpty()) {
				if (front.peek() == side.peek()) {
					// 両方のキューの先頭が一緒なら両方出す
					ans += front.poll();
					side.poll();
				} else if (side.isEmpty() || front.peek() < side.peek()) {
					// どちらかが空か、小さい数字が残っていたらそれを出す
					ans += front.poll();
				} else if (front.isEmpty() || front.peek() > side.peek()) {
					ans += side.poll();
				}
			}

			System.out.println(ans);
		}

	}
}