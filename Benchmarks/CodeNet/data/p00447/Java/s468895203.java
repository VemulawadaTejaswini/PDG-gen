import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		for (int m; (m = in.nextInt()) > 0;) {
			int[][] seiza = new int[m][];
			while (--m >= 0) {
				seiza[m] = new int[] { in.nextInt(), in.nextInt() };
			}

			int n = in.nextInt();
			int[][] hosi = new int[n][];
			while (--n >= 0) {
				hosi[n] = new int[] { in.nextInt(), in.nextInt() };
			}
			int k = hosi.length - 1;
			HolePlate plate = new HolePlate(seiza);
			for (; !plate.isMatch(hosi);) {
				plate.dx = -(seiza[0][0] - hosi[k][0]);
				plate.dy = -(seiza[0][1] - hosi[k][1]);
				k--;
			}
			System.out.println(plate.dx + " " + plate.dy);

		}
		in.close();
	}
}

class HolePlate {
	final Set<int[]> seiza;
	int dx = 0, dy = 0;

	public HolePlate(int[][] seiza) {
		HashSet<int[]> set = new HashSet<int[]>();
		for (int[] star : seiza) {
			set.add(star);
		}
		this.seiza = Collections.unmodifiableSet(set);
	}

	public void setPosi(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}

	Set<int[]> set = new HashSet<int[]>();

	public boolean isMatch(int[][] stars) {
		for (int[] hole : seiza) {
			int[] moveHole = new int[] { hole[0] + dx, hole[1] + dy };
			boolean finded = false;
			for (int[] star : stars) {
				if (Arrays.equals(moveHole, star)) {
					finded = true;
					break;
				}
			}
			if (!finded)
				return false;
		}
		return true;
	}
}