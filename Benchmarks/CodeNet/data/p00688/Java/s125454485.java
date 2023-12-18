import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			final int D = b * b - 4 * a * c;

			if (D < 0) {
				System.out.println("Impossible");
			} else if (D >= 0) {
				boolean found = false;
				int cur_d = D;

				for (int i = 0; i <= 20000; i++) {
					
					//System.out.println(i + " " +  cur_d);
					
					if (cur_d == i * i) {
						found = true;
						break;
					}else if(i >= 2 && cur_d % (i * i) == 0){
						cur_d /= (i * i);
						i--;
					}
				}
				
				//System.out.println(D);

				if (!found) {
					System.out.println("Impossible");
				} else {
					final int x = (int) (2 * a);
					final int r_ = (int) (-b + Math.sqrt(D));
					final int s_ = (int) (-b - Math.sqrt(D));
					
					//System.out.println(x + " " + r_ + " " + s_);
					
					final int gcd_p = gcd(x, Math.abs(r_));
					final int gcd_q = gcd(x, Math.abs(s_));
					
					int p = x / gcd_p;
					int r = -(r_ / gcd_p);
					int q = x / gcd_q;
					int s = -(s_ / gcd_q);
					
					if (p < 0 && r < 0) {
						p = -p;
						r = -r;
					}

					if (q < 0 && s < 0) {
						q = -q;
						s = -s;
					}

					if (p > q) {
						System.out.println(p + " " + r + " " + q + " " + s);
					} else {
						System.out.println(q + " " + s + " " + p + " " + r);
					}
				}
			}

		}

	}

}