import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P {
		Double x;
		Double y;

		P() {
		};

		P(Double x, Double y) {
			this.x = x;
			this.y = y;
		}

		P sub(P p) {
			return new P(this.x - p.x, this.y - p.y);
		}

		P right() {
			return new P(-this.y, this.x);
		}

		Double dot(P p) {
			return this.x * p.x + this.y * p.y;
		}
	}

	void run() {
		for (int cccc = 0; cccc < 2; cccc++) {
			P[] p = new P[4];
			for (int i = 0; i < 4; i++) {
				p[i] = new P();
				p[i].x = sc.nextDouble();
				p[i].y = sc.nextDouble();
			}
			boolean ret = true;
			for (int i = 0; i < 3; i++) {
				P line = p[(i + 1) % 3].sub(p[i]);
				P odd = p[(i + 2) % 3].sub(p[i]);
				P tar = p[3].sub(p[i]);
				if (line.right().dot(tar) * line.right().dot(odd) <= 0) {
					ret = false;
				}
			}
			System.out.println(ret ? "YES" : "NO");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}