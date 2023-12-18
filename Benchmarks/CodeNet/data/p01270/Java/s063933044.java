import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			LinkedList<Segment> list = new LinkedList<Segment>();
			list.add(new Segment(-1, 0));
			list.add(new Segment(-2, 1000000001));
			for (int i = 0; i < N; ++i) {
				char command = sc.next().charAt(0);
				if (command == 'W') {
					int I = sc.nextInt();
					int S = sc.nextInt();
					ListIterator<Segment> itr = list.listIterator();
					Segment cur = itr.next();
					while (S > 0) {
						Segment next = itr.next();
						if (cur.i == -1) {
							if (next.pos - cur.pos <= S) {
								cur.i = I;
								S -= next.pos - cur.pos;
							} else {
								itr.previous();
								itr.previous();
								itr.add(new Segment(I, cur.pos));
								cur.pos += S;
								S = 0;
							}
						}
						cur = next;
					}
				} else if (command == 'D') {
					int I = sc.nextInt();
					ListIterator<Segment> itr = list.listIterator();
					while (itr.hasNext()) {
						Segment cur = itr.next();
						if (cur.i == I) {
							cur.i = -1;
							itr.previous();
							if (itr.hasPrevious()) {
								Segment prev = itr.previous();
								itr.next();
								itr.next();
								if (prev.i == -1) {
									itr.remove();
								}
							} else {
								itr.next();
							}
							if (itr.hasNext() && itr.next().i == -1) {
								itr.remove();
							}
						}
					}
				} else {
					int P = sc.nextInt();
					ListIterator<Segment> itr = list.listIterator();
					Segment cur = itr.next();
					while (itr.hasNext()) {
						Segment next = itr.next();
						if (P < next.pos) {
							System.out.println(cur.i);
							break;
						}
						cur = next;
					}
				}
			}
			System.out.println();
		}
	}

	static class Segment {
		int i, pos;

		public Segment(int i, int pos) {
			this.i = i;
			this.pos = pos;
		}
	}

}