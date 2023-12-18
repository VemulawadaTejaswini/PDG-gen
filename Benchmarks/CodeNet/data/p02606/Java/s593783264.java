package エイシングプログラミングコンテスト2020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int x = R/d;
		int y = L/d;
		System.out.println(x-y);

	}

}
