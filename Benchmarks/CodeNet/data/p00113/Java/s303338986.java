import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			new Main(p, q);
		}
	}

	int p, q;
	int aaaa = 2;
	String shousuu = "";
	ArrayList<Integer> amari = new ArrayList<Integer>();

	Main(int p, int q) {
		this.p = p;
		this.q = q;
		solve();
	}

	private void solve() {
		System.out.print("0.");
		solve2((p % q) * 10);
	}

	private void solve2(int warareru) {
		aaaa++;
		if (warareru == 0) {
			System.out.println();
		} else if (!amari.contains(warareru)) {
			amari.add(warareru);
			System.out.print(warareru / q);
			solve2((warareru - q * (warareru / q)) * 10);
		} else {
			System.out.println();
			int basho = amari.indexOf(warareru);
			for (int i = 0; i < aaaa - 1; i++) {
				if (i < basho + 2)
					System.out.print(" ");
				else
					System.out.print("^");
			}
			System.out.println();
		}
	}
}