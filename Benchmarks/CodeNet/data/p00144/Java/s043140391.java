import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
 
public class Main {
	/**
	* @param args
	*/
	static class RT extends HashMap<Integer, int[]>{}
	static class DS extends HashMap<Integer, Integer>{}
	static class LS extends ArrayList<Integer>{}
	static class AS extends HashMap<Integer, DS>{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RT		m = new RT();
		AS		o = new AS();
		int		n = parseNum();
		int		p = 0;
		int		s = 0;
		int		d = 0;
		int		v = 0;
		int[]	T = new int[n];

		// ルータの経路を取得
		for (int i = 0; i < T.length; i++) {
			int		cr = parseNum();
			int[]	nr = new int[parseNum()];

			for (int j = 0; j < nr.length; j++) {
				nr[j] = parseNum();
			}
			m.put(cr, nr);
			T[i] = cr;
		}

		// 他のルータまでの距離を取得
		for (int i = 0; i < T.length; i++) {
			int		len = 0;
			int		cnt = 2;
			DS		ttl = new DS();
			LS		lst = new LS();

			lst.add(T[i]);
			ttl.put(T[i], 1);
			while ((len = lst.size()) > 0) {
				for (int j = 0; j < len; j++) {
					int[]	np = m.get(lst.remove(0));
					for (int k = 0; k < np.length; k++) {
						if (!ttl.containsKey(np[k])) {
							ttl.put(np[k], cnt);
							lst.add(np[k]);
						}
					}
				}
				cnt++;
			}

			o.put(T[i], ttl);
		}

		p = parseNum();
		for (int i = 0; i < p; i++) {
			s = parseNum();
			d = parseNum();
			v = parseNum();
			if (!o.containsKey(s)) {
				System.out.println("NA");
			} else {
				DS	tmp = o.get(s);
				if (!tmp.containsKey(d)) {
					System.out.println("NA");
				} else {
					int	max = tmp.get(d);
					if (v < max) {
						System.out.println("NA");
					} else {
						System.out.println(Math.min(v, max));
					}
				}
			}
		}
	}
 
	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;
 
			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if (skp == 0) {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}