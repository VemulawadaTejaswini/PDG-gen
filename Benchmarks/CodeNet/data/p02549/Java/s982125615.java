import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] l = new int[k];
		int[] r = new int[k];
		for (int i = 0; i < k; i++) {
			sa = br.readLine().split(" ");
			l[i] = Integer.parseInt(sa[0]);
			r[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int mod = 998244353;
		FenwickTree ft = new FenwickTree(n);
		ft.add(0, 1);
		for (int i = 1; i < n; i++) {
			long sum = 0;
			for (int j = 0; j < k; j++) {
				int ll = Math.max(i - r[j], 0);
				int rr = Math.max(i - l[j] + 1, 0);
				sum += ft.sum(ll, rr);
				sum %= mod;
			}
			ft.add(i, sum);
		}
		System.out.println(ft.sum(n - 1, n));
	}
}

/**
 * Fenwick Tree（Binary Indexed Tree）
 */
class FenwickTree {
	private int n;
	private long[] data;

	/**
	 * 長さnの配列（a[0]～a[n-1]）を作る。初期値は全て0。<br>
	 * O(n)
	 * 
	 * @param n 配列の長さ
	 */
	public FenwickTree(int n) {
		this.n = n;
		data = new long[n];
	}

	/**
	 * 初期データを元にFenwick Treeを構成する。<br>
	 * O(n)
	 * 
	 * @param data 初期データ
	 */
	public FenwickTree(long[] data) {
		this(data.length);
		build(data);
	}

	/**
	 * a[p] += x を行う。<br>
	 * O(log n)
	 * 
	 * @param p 加算位置（0≦p＜n）
	 * @param x 加算値
	 */
	void add(int p, long x) {
		assert 0 <= p && p < n : "p=" + p;

		p++;
		while (p <= n) {
			data[p - 1] += x;
			p += p & -p;
		}
	}

	/**
	 * a[l] + ... + a[r-1] を返す。<br>
	 * O(log n)
	 * 
	 * @param l 開始位置（含む）    （0≦l≦r≦n）
	 * @param r 終了位置（含まない）（0≦l≦r≦n）
	 */
	long sum(int l, int r) {
		assert 0 <= l && l <= r && r <= n : "l=" + l + ", r=" + r;

		return sum(r) - sum(l);
	}

	/**
	 * a[0] + ... + a[r-1] を返す。<br>
	 * O(log n)
	 * 
	 * @param r 終了位置（含まない）（0≦r≦n）
	 */
	long sum(int r) {
		assert 0 <= r && r <= n : "r=" + r;

		long s = 0;
		while (r > 0) {
			s += data[r - 1];
			r -= r & -r;
		}
		return s;
	}

	private void build(long[] dat) {
		System.arraycopy(dat, 0, data, 0, n);
		for (int i = 1; i <= n; i++) {
			int p = i + (i & -i);
			if (p <= n) {
				data[p - 1] += data[i - 1];
			}
		}
	}
}
