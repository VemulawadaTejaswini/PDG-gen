import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next()),
			M = Integer.parseInt(sc.next()),
			R = Integer.parseInt(sc.next());

		// 条件の縮退
		R = R - N * M;
		M = 0;

		// 未成立
		if (R < 1) {
			System.out.println(0);
			return;
		}

		// 初期ノードの生成
		Deque<String> stack = new LinkedList<String>();
		for (int i = 0 ; i < N ; i++) {
			stack.addLast(i+" ");
		}

		List<String> list = new ArrayList<String>();

		// 再帰処理
		while (!stack.isEmpty()) {
			//for (String s : stack) {
			//	System.out.print("("+s+")"+" ");
			//}System.out.print("\n");

			String str = stack.pollLast().trim();
			String[] tokens = str.split(" ");
			if (tokens.length == R) {
				list.add(str);
			} else {
				int last = Integer.parseInt(tokens[tokens.length-1]);
				for (int i = last ; i < N ; i++) {
					stack.addLast(str+" "+i);
				}
			}
		}

		//System.out.println("\n-------");
		//for (String s : list) {
		//	System.out.println("("+s+")");
		//}System.out.print("\n-------");
		System.out.println(list.size());

	}

	public static void main(String[] args) {
		new Main().run();
	}

}