import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				new Unit(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			}
			for (int i = 1; i <= a + b + c; i++) {
				System.out.println(Parts.of(i).state);
			}
		}
	}
}

class Parts {
	final int num;
	int state = 2;
	final Set<Unit> needCheckUnits = new HashSet<Unit>();

	Parts(int num) {
		this.num = num;
	}

	static HashMap<Integer, Parts> map = new HashMap<Integer, Parts>();

	static Parts of(int num) {
		if (map.containsKey(num)) {
			return map.get(num);
		} else {
			Parts result = new Parts(num);
			map.put(num, result);
			return result;

		}
	}

	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Parts other = (Parts) obj;
		if (num != other.num)
			return false;
		return true;
	}

	void setOK() {
		this.state = 1;
		for (Iterator<Unit> i = needCheckUnits.iterator(); i.hasNext();) {
			Unit unit = i.next();
			if (unit.isAllset()) {
				i.remove();
			}

		}
	}
}

class Unit {
	final Parts a, b, c;
	final boolean isOK;

	Unit(int i, int j, int k, int r) {
		a = Parts.of(i);
		b = Parts.of(j);
		c = Parts.of(k);
		isOK = (r == 1);
		isAllset();
	}

	boolean isAllset() {
		if (isOK) {
			a.setOK();
			b.setOK();
			c.setOK();
			return true;
		} else {
			boolean result = a.state == 0 && b.state == 0 && c.state == 0;
			result = result || c(a, b, c);
			result = result || c(b, c, a);
			result = result || c(c, a, b);
			return result;
		}
	}

	private boolean c(Parts x, Parts y, Parts z) {
		if (x.state == 2) {
			if (y.state == 1 && z.state == 1) {
				x.state = 0;
				return true;
			} else {
				x.needCheckUnits.add(this);
				int size = x.needCheckUnits.size();
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + (isOK ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Unit))
			return false;
		Unit other = (Unit) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (isOK != other.isOK)
			return false;
		return true;
	}