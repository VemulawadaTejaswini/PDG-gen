import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> lastNumList;
	static int n;
	static int count = 0;
	static Pair pair;

	public static void main(String[] args) {
		lastNumList = new ArrayList<Integer>();
		lastNumList.add(0);
		n = sc.nextInt();
		pair = new Pair(0, 0);
		for (int i = 0; i < n; i++) {
			// System.out.println("dfs is " + i + "??????");
			dfs();
		}

	}

	public static void dfs() {
		if (count >= 10) {
			System.out.println("YES");
			init();
			return;
		}
		count++;

		int nextNum = sc.nextInt();

		if (nextNum < pair.left && nextNum < pair.right) {
			System.out.println("NO");
			init();
			return;
		}

		// ?????£???????????§?????????
		if (nextNum < pair.left || nextNum < pair.right) {
			if (nextNum>pair.left) {
				pair.left = nextNum;
				// System.out.println(pair.left + " " + pair.right + "count:" +
				// count);
				dfs();
				return;
			} else {
				pair.right = nextNum;
				// System.out.println(pair.left + " " + pair.right + "count:" +
				// count);
				dfs();
				return;
			}
		}
		// ?????£????????\??????
		// ?????????????°???????
		if (nextNum - pair.left <= nextNum - pair.right) {
			pair.left = nextNum;
			// System.out.println(pair.left + " " + pair.right + "count:" +
			// count);
			dfs();
			return;
		}else{
			//????????????????????°????????£??????
			pair.right = nextNum;
			// System.out.println(pair.left + " " + pair.right + "count:" +
			// count);
			dfs();
			return;
		}

	}

	public static void init() {
		count = 0;
		pair.left = 0;
		pair.right = 0;
	}

}

class Pair {
	int left;
	int right;

	Pair(int a, int b) {
		left = a;
		right = b;
	}

}