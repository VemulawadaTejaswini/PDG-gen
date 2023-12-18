import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		double W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		double ans = 0;
		for (int i = 0; i < N; ++i) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
			if (w[i] <= 0 && v[i] >= 0) {
				ans += v[i];
				W -= w[i];
			}
		}
		ArrayList<Product> add = new ArrayList<Product>();
		ArrayList<Product> sub = new ArrayList<Product>();
		for (int i = 0; i < N; ++i) {
			if (w[i] > 0 && v[i] > 0) {
				add.add(new Product(w[i], v[i]));
			} else if (w[i] < 0 && v[i] < 0) {
				sub.add(new Product(w[i], v[i]));
			}
		}
		Collections.sort(add);
		Collections.sort(sub);
		int addI = add.size() - 1;
		double addX = 1.0;
		int subI = 0;
		double subX = 1.0;
		while (addI >= 0) {
//			System.out.println(W + " " + ans + " " + addI + " " + addX + " " + subI + " " + subX);
			double needW = add.get(addI).w * addX;
			if (W == 0) {
				if (subI >= sub.size() || add.get(addI).e() < sub.get(subI).e()) break;
				double feedW = Math.abs(sub.get(subI).w) * subX;
				if (feedW < needW) {
					W += feedW;
					ans += sub.get(subI).v * subX;
					++subI;
					subX = 1.0;
				} else {
					double difX = needW / Math.abs(sub.get(subI).w);
					W = needW;
					ans += sub.get(subI).v * difX;
					subX -= difX;
				}
//				System.out.println("  " + W + " " + ans + " " + addI + " " + addX + " " + subI + " " + subX);
			}
			if (needW > W) {
				ans += add.get(addI).e() * W;
				addX -= W / add.get(addI).w;
				W = 0;
			} else {
				ans += add.get(addI).e() * needW;
				W -= needW;
				--addI;
				addX = 1.0;
			}
		}
		System.out.println(new BigDecimal(ans).toPlainString());
	}

	static class Product implements Comparable<Product> {
		int w, v;

		Product(int w, int v) {
			this.w = w;
			this.v = v;
		}

		double e() {
			return 1.0 * this.v / this.w;
		}

		public int compareTo(Product o) {
			return this.v * o.w - this.w * o.v;
		}
	}

}