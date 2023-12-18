import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			ArrayList<Cake> cakes = new ArrayList<Cake>();
			String input = br.readLine();
			String[] nwd = input.split("[\\s]");
			int n = Integer.parseInt(nwd[0]);
			int w = Integer.parseInt(nwd[1]);
			int d = Integer.parseInt(nwd[2]);
			if (n == 0 && w == 0 && d == 0) {
				break;
			}
			Cake cake = new Cake(1, w, d);
			cakes.add(cake);
			for (int i = 0; i < n; i++) {
				Cake target = null;
				String line = br.readLine();
				String[] ps = line.split("[\\s]");
				int p = Integer.parseInt(ps[0]);
				int s = Integer.parseInt(ps[1]);
				/*
				 * for (Cake tmp : cakes) { if (p == tmp.getId()) { target =
				 * tmp; } }
				 */
				target = cakes.get(p - 1);
				Cake[] pieces = target.cut(s, i + 1);
				cakes.remove(target);
				cakes.add(pieces[0]);
				cakes.add(pieces[1]);
			}
			Collections.sort(cakes);

			System.out.print(cakes.get(0).getArea());
			for (int i = 1; i < cakes.size(); i++) {
				Cake tmp = cakes.get(i);
				System.out.print(" " + tmp.getArea());
			}
			System.out.println();
		}
	}
}

class Cake implements Comparable<Cake> {
	private int id;
	private int w;
	private int d;
	private int area;

	public Cake(int id, int w, int d) {
		this.id = id;
		this.w = w;
		this.d = d;
		this.area = w * d;
	}

	public Cake[] cut(int s, int i) {
		Cake[] pieces = new Cake[2];
		s %= (w + d) * 2;
		int aw = 0, ad = 0;
		int bw = 0, bd = 0;
		if (s < w) {
			aw = s;
			ad = d;
			bw = w - aw;
			bd = d;
		} else if (s < w + d) {
			aw = w;
			ad = s - w;
			bw = w;
			bd = d - ad;
		} else if (s < 2 * w + d) {
			aw = s - w - d;
			ad = d;
			bw = w - aw;
			bd = d;
		} else if (s < (2 * w + 2 * d)) {
			aw = w;
			ad = s - 2 * w - d;
			bw = w;
			bd = d - ad;
		}

		if (aw * ad < bw * bd) {
			pieces[0] = new Cake(i, aw, ad);
			pieces[1] = new Cake(i + 1, bw, bd);
		} else {
			pieces[0] = new Cake(i, bw, bd);
			pieces[1] = new Cake(i + 1, aw, ad);
		}
		return pieces;
	}

	public int getId() {
		return this.id;
	}

	public int getArea() {
		return this.area;
	}

	@Override
	public int compareTo(Cake c) {
		if (area < c.area) {
			return -1;
		} else if (area > c.area) {
			return 1;
		} else {
			return 0;
		}
	}
}