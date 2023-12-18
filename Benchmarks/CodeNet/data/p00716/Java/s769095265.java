import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new A1135().ans(sc);

	}

}

class A1500 {
	int count1500 = 0;

	public void ans(Scanner sc) {
		int len = sc.nextInt();
		sc.nextLine();
		String id = sc.nextLine();
		int x = sc.nextInt();
		ArrayList<Integer> pa = new ArrayList<Integer>();
		ArrayList<Integer> po = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			pa.add(sc.nextInt());
			if (pa.get(i) % 2 == 0) {

			} else {
				po.add(pa.get(i));
			}
		}

		int sum = 0;
		int even = 0;
		int odd = 0;

		for (int i = 0; i < id.length(); i++) {
			int t = id.length() - i - 1;

			char c = id.charAt(t);
			if (c == '*') {
				if (t % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else {
				int d = Integer.parseInt(String.valueOf(c));
				if (t % 2 == 0) {
					sum += (d / 10) + (d % 10);
				} else {
					sum += d;
				}
			}
		}

		System.out.println(sum);
		System.out.println(even);
		System.out.println(odd);

		System.out.println(id);
	}

	void re1500(int sum, int even, int odd, ArrayList<Integer> pa,
			ArrayList<Integer> po) {
		if (even == 0 && odd == 0) {

		} else {
			if (sum % 2 == 0) {

			} else {
				if (odd > 0) {
					for (Iterator iterator = po.iterator(); iterator.hasNext();) {
						Integer integer = (Integer) iterator.next();
						re1500(sum + integer, even, odd - 1, pa, po);
					}
				}
			}
		}
	}

}

class A1129 {

	public void ans(Scanner sc) {

		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();

			if (n == 0) {
				break;
			}
			LinkedList<Integer> yama = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				yama.addFirst(i + 1);
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();

				for (int j = 0; j < c; j++) {
					yama.add(j, yama.remove(p + j - 1));
				}
			}
			System.out.println(yama.getFirst());
		}

	}

}

class A1135 {

	public void ans(Scanner sc) {
		int M = sc.nextInt();

		for (int m = 0; m < M; m++) {
			int money = sc.nextInt();
			int year = sc.nextInt();

			int n = sc.nextInt();
			int max = 0;
			for (int i = 0; i < n; i++) {
				int me = sc.nextInt();
				double ri = sc.nextDouble();
				int te = sc.nextInt();

				int A = money;
				if (me == 1) {
					for (int y = 0; y < year; y++) {
						A = A + (int) (A * ri) - te;
					}
				} else {
					int Risi = 0;
					for (int y = 0; y < year; y++) {
						Risi += (int) (A * ri);
						A = A - te;
					}
					A += Risi;
				}
				max = Math.max(max, A);
			}

			System.out.println(max);
		}

	}

}