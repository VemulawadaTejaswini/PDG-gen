
import java.util.Scanner;

class Main {

	/*
	 * 着席位置：中央前から３列目
	 * 問題：https://onlinejudge.u-aizu.ac.jp/problems/DSL_1_A
	 */

	private static int n[];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = new int[Integer.parseInt(scanner.next())];
		for(int i=0; i<n.length; i++) {
			n[i] = i;//最初は全てroot
		}
		int q = Integer.parseInt(scanner.next());

		for(int i=0; i<q; i++) {
			String order = scanner.next();
			if(order.equals("0")) {
				unite(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
			}else if(order.equals("1")){
				same(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
			}
		}

		scanner.close();
	}

	//木を合体させる
	private static void unite(int x, int y) {
		int X = root(x), Y = root(y);
		n[Y] = X;
	}

	//同じ木か調べる
	private static void same(int x, int y) {
		if (root(x)==root(y)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

	//rootを返す
	private static int root(int i) {
		if(n[i]==i) return i;
		else {
			return root(n[i]);
		}
	}

}

