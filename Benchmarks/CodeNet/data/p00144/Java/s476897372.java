import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Packet Transportation
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			byte n = Byte.parseByte(line);

			// router info
			Router.setCount(n);
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				byte id, next;
				id = Byte.parseByte(st.nextToken());
				next = Byte.parseByte(st.nextToken());
				Router.setRouter(id);
				for (int j = 0; j < next; j++) {
					Router.getRouter(id)
							.addNext(Byte.parseByte(st.nextToken()));
				}
			}

			// packet info
			int p = Integer.parseInt(br.readLine());
			for (int i = 0; i < p; i++) {
				byte src, dst, ttl, hop;
				int d1, d2;
				line = br.readLine();
				d1 = line.indexOf(' ');
				d2 = line.indexOf(' ', d1 + 1);
				src = Byte.parseByte(line.substring(0, d1));
				dst = Byte.parseByte(line.substring(d1 + 1, d2));
				ttl = Byte.parseByte(line.substring(d2 + 1));
				hop = Router.getHops(src, dst, ttl);
				if (hop > 0) {
					System.out.println(hop);
				} else {
					System.out.println("NA");
				}
			}
		}
	}
}

class Router {

	byte id;
	ArrayList<Byte> nexts;

	private static Router[] routers;

	static Router[] setCount(byte n) {
		if (routers == null) {
			routers = new Router[n + 1];
		}
		return routers;
	}

	static void setRouter(byte id) {
		Router r = new Router(id);
		routers[r.id] = r;
	}

	static Router getRouter(byte id) {
		return routers[id];
	}

	static byte getHops(byte src, byte dst, byte ttl) {

		Deque<Router.Hop> deque = new ArrayDeque<Router.Hop>();
		boolean[] passed = new boolean[routers.length];
		byte hop = 0;

		Router r = getRouter(src);
		deque.offer(r.new Hop(r, (byte) (ttl - 1)));
		passed[r.id] = true;
		while (!deque.isEmpty()) {
			Hop h = deque.poll();
			if (h.router.id == dst) {
				hop = (byte) (ttl - h.ttl);
				break;
			} else if (h.ttl > 0) {
				if (h.router.nexts.size() != 0) {
					for (Byte i : h.router.nexts) {
						if (!passed[i]) {
							r = getRouter(i);
							deque.offer(r.new Hop(r, (byte) (h.ttl - 1)));
							passed[i] = true;
						}
					}
				}
			}
		}
		return hop;
	}

	//
	private Router(byte id) {
		this.id = id;
		nexts = new ArrayList<Byte>();
	}

	public void addNext(byte id) {
		nexts.add(id);
	}

	private class Hop {
		Router router;
		byte ttl;

		public Hop(Router router, byte ttl) {
			this.router = router;
			this.ttl = ttl;
		}
	}

}