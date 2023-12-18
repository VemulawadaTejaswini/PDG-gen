import java.io.IOException;
import java.util.Arrays;

public class Main {
	/**
	* @param args
	*/
 
	static class Seat {
		public	int	b = 0;
	}

	static class Grp {
		public	int	s = 0;
		public	int	e = 0;
		public	int	n = 0;
		public	int	b = 0;
		public	int	w = -1;

		public Grp(int i) {
			this.s = i*5;
			this.e = 17*(i%2)+3*(i%3)+19;
			this.n = (i%5==1)?5:2;
		}
	}

	static class Lst {
		public	int[]	d = new int[101];
		public	int		h = 0;
		public	int		t = 0;

		public void add(int e) {
			d[t++] = e;
			this.sort();
		}

		public int get(int i) {
			return d[h+i];
		}

		public int remove(int i) {
			int	rmv = this.d[h];
			this.d[h+i] = 0;
			this.sort();
			this.h++;
			return rmv;
		}

		public int size() {
			return t-h;
		}

		public void sort() {
			Arrays.sort(d, h, t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grp[]	g = new Grp[100];
		Seat	s = new Seat();
		Lst		e = new Lst();
		Lst		w = new Lst();
		int		o = 0;
		
		for (int i = 0; i < g.length || w.size() > 0; i++) {
			int	tm = i*5;
			int	eh = (e.size() > 0)?e.get(0):0;

			if (i < g.length) {
				g[i] = (g[i] == null)?new Grp(i):g[i];
			}

			if (eh/100 <= tm && eh != 0) {
				tm  = eh/100;
				while (e.size() > 0) {
					if (e.get(0)/100 == tm) {
						s.b = s.b&(~g[e.get(0)%100].b);
						e.remove(0);
					} else {
						break;
					}
				}
			}

			while (w.size() > 0) {
				int	k = w.get(0)%100;

				if (g[k].s > tm) break;

				if (isAvailableSeat(s, null, g[k])) {
					// グループの待ち時間を計算
					g[k].w = Math.max(0, tm-g[k].s);

					// グループが食べ終わる時間を追加
					e.add((g[k].s+g[k].w+g[k].e)*100+k);
					w.remove(0);
				} else {
					break;
				}
			}

			if (tm == i*5) {
				if (i < g.length) {
					// 席があるかチェック
					if (isAvailableSeat(s, w, g[i])) {
						// グループが食べ終わる時間を追加
						e.add((g[i].s+g[i].w+g[i].e)*100+i);
					} else {
						// 待っているグループリストへ追加
						w.add(g[i].s*100+i);
					}
				}
			} else {
				i--;
			}
		}
		
		while ((o = parseNum()) != -1) {
			System.out.println(g[o].w);
		}
	}

	private static boolean isAvailableSeat(Seat s, Lst w, Grp g) {
		boolean bSt = false;
		int		bit = (1<<g.n)-1;
		int		len = (w == null)?0:w.size();

		for (int i = 0; i <= 17-g.n && !bSt && len == 0; i++, bit<<=1) {
			if ((s.b&bit) == 0) {
				s.b = s.b|bit;
				g.b = bit;
				g.w = 0;
				bSt = true;
			}
		}
		return bSt;
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = -1;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					num = (num == -1)?0:num;
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = (num == -1)?0:num;
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if (skp == 0 || buf == -1) {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}