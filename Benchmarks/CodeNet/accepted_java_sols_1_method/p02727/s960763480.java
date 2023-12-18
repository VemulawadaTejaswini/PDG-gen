import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<Integer> p = new ArrayList<Integer>();
		ArrayList<Integer> q = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
			p.add(sc.nextInt());
		}
		for (int i = 0; i < b; i++) {
			q.add(sc.nextInt());
		}
		for (int i = 0; i < c; i++) {
			r.add(sc.nextInt());
		}
		Collections.sort(p);
		Collections.reverse(p);
		Collections.sort(q);
		Collections.reverse(q);
		Collections.sort(r);
		Collections.reverse(r);
		sc.close();

		long sum = 0;
		for (int i = 0; i < x; i++) {
			sum += p.get(i);
		}
		for (int i = 0; i < y; i++) {
			sum += q.get(i);
		}

		int index1 = x - 1;
		int index2 = y - 1;
		for (int i = 0; i < c; i++) {
			int v1 = index1 >= 0 ? p.get(index1) : Integer.MAX_VALUE;
			int v2 = index2 >= 0 ? q.get(index2) : Integer.MAX_VALUE;
			if (v1 < v2) {
				if (v1 < r.get(i)) {
					sum += (r.get(i) - v1);
					index1--;
				} else {
					break;
				}
			} else {
				if (v2 <= r.get(i)) {
					sum += (r.get(i) - v2);
					index2--;
				} else {
					break;
				}
			}
		}

		System.out.println(sum);
	}
}
