import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		PriorityQueue<Obj> que = new PriorityQueue<>((o1, o2) -> o2.v - o1.v);
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.a = Integer.parseInt(sa[i]);
			o.c = 1;
			o.v = o.a;
			que.add(o);
		}
		br.close();

		for (int i = 0; i < k; i++) {
			Obj o = que.poll();
			o.c++;
			o.v = (o.a + o.c - 1) / o.c;
			que.add(o);
		}
		System.out.println(que.peek().v);
	}

	static class Obj {
		int a, c, v;
	}
}
