import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Long[] pa = new Long[a];
		Long[] pb = new Long[b];
		Long[] pc = new Long[c];
		for (int i = 0; i < a; i++) {
			pa[i] = sc.nextLong();
		}
		for (int i = 0; i < b; i++) {
			pb[i] = sc.nextLong();
		}
		for (int i = 0; i < c; i++) {
			pc[i] = sc.nextLong();
		}

		Arrays.sort(pa, (v, w) -> Long.compare(w, v));
		Arrays.sort(pb, (v, w) -> Long.compare(w, v));
		Arrays.sort(pc, (v, w) -> Long.compare(w, v));
		PriorityQueue<Long> pq = new PriorityQueue<>();
		long answer = 0;
		for (int i = 0; i < x; i++) {
			pq.offer(pa[i]);
			answer += pa[i];
		}
		for (int i = 0; i < y; i++) {
			pq.offer(pb[i]);
			answer += pb[i];
		}

		int ci = 0;
		while (ci < pc.length) {
			long z = pq.peek();
			if (z > pc[ci]) break;
			pq.poll();
			answer += pc[ci] - z;
			pq.offer(pc[ci++]);
		}

		System.out.println(answer);
	}
}
