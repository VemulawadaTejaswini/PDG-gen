

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		ArrayDeque<Integer> d = new ArrayDeque<Integer>();
		boolean flg = false;
		if (n % 2 == 0) {
			flg = true;
		}

		for (int i = 1; i <= n; i++) {
			a = Integer.parseInt(sc.next());
			if (flg) {
				if (i % 2 == 0)
					d.addFirst(a);
				else
					d.addLast(a);
			} else {
				if (i % 2 == 0)
					d.addLast(a);
				else
					d.addFirst(a);
			}
		}

		for (int i : d) {
			System.out.print(i + " ");
		}
		System.out.println("");

	}

}
