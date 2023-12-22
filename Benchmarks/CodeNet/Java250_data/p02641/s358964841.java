import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println(x);
			return;
		}
		Set<Integer> p = new HashSet<>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		sc.close();

		Integer underPos = null;
		Integer upwardPos = null;

		// 下方向探索
		int startPos = x;
		while (underPos == null) {
			if (p.contains(startPos) != true) {
				underPos = startPos;
			}
			startPos--;
		}
		// 上方向探索
		startPos = x;
		while (upwardPos == null) {
			if (p.contains(startPos) != true) {
				upwardPos = startPos;
			}
			startPos++;
		}
		// 差分を出す
		int underDist = Math.abs(x - underPos);
		int upwardDist = Math.abs(x - upwardPos);
		if (underDist == upwardDist) {
			System.out.println(underPos);
			return;
		}

		if (underDist < upwardDist) {
			System.out.println(underPos);
		} else {
			System.out.println(upwardPos);
		}

	}
}
