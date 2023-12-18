import java.util.*;

class Fraction {
	int up;
	int down;
	public Fraction(int up, int down) {
		this.up = up;
		this.down = down;
	}
	public Fraction makeBetween(Fraction right) {
		return new Fraction(this.up + right.up, this.down + right.down);
	}
}

class FractionList {
	ArrayList<Fraction> vector = new ArrayList<Fraction>();
	public void append(Fraction f) {
		vector.add(f);
	}
	public Fraction get(int index) {
		return (Fraction)vector.get(index);
	}
	public int size() {
		return vector.size();
	}
}

class MainApp {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int n = 0; n < t; n++) {
			int N = sc.nextInt();
			FractionList list = new FractionList();
			list.append(new Fraction(0, 1));
			list.append(new Fraction(1, 1));
			boolean stable = false;
			while (!stable) {
				FractionList next = new FractionList();
				stable = true;
				for (int i = 0; i < list.size(); i++) {
					Fraction left = list.get(i);
					next.append(left);
					if (i + 1 < list.size()) {
						Fraction right = list.get(i + 1);
						Fraction middle = left.makeBetween(right);
						if (middle.down <= N) {
							next.append(middle);
							stable = false;
						}
					}
				}
				list = next;
			}
			System.out.println(list.size());
		}
	}
}