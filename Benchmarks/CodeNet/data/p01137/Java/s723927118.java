import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int e = sc.nextInt();
			if (e == 0)
				break;
			int m = Integer.MAX_VALUE;
			double sq = Math.sqrt(e);
			double tr = Math.pow(e, 1.0 / 3);
			for (int y = 0; y <= sq; y++) {
				for (int z = 0; z <= tr; z++) {
					if (y * y + z * z * z > e)
						break;
					int tmp = e - (y * (y - 1) + z * (z * z - 1));
					if (tmp > 0)
						m = Math.min(m, tmp);
				}
			}
			System.out.println(m);
		}
	}
}