import java.util.*;
class RMQ {
	private int size_, dat[];
	private int query_(int a, int b, int k, int l, int r) {
		if(r <= a || b <= l) return 2147483647;
		if(a <= l && r <= b) return dat[k];
		int lc = query_(a, b, 2 * k, l, (l + r) / 2);
		int rc = query_(a, b, 2 * k + 1, (l + r) / 2, r);
		return Math.min(lc, rc);
	}
	RMQ(int s) {
		for(size_ = 1; size_ < s;) size_ *= 2;
		dat = new int[size_ * 2];
		for(int i = 0; i < size_ * 2; i++) dat[i] = 2147483647;
	}
	public void update(int pos, int x) {
		pos += size_; dat[pos] = x;
		while(pos > 1) {
			pos /= 2;
			dat[pos] = Math.min(dat[2 * pos], dat[2 * pos + 1]);
		}
	}
	public int query(int l, int r) {
		return query_(l, r, 1, 0, size_);
	}
}
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		RMQ r = new RMQ(n);
		for(int i = 0; i < q; i++) {
			int c = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			if(c == 0) r.update(x, y);
			else System.out.println(r.query(x, y + 1));
		}
	}
}