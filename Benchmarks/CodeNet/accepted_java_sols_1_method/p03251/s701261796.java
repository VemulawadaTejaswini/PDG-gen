import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, X, Y;
		n = sc.nextInt();
		m = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			x.add(sc.nextInt());
		}

		for (int i = 0; i < m; i++) {
			y.add(sc.nextInt());
		}

		Collections.sort(x);
		Collections.sort(y);

		boolean ok = false;
		for (int z = X + 1; z <= Y; z++) {
			if (x.get(x.size() - 1) < z && y.get(0) >= z) {
				ok = true;
				break;
			}
		}

		if (ok) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}

		sc.close();
	}
}