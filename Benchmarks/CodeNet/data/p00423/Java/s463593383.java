import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Pair {
	private int numA;
	private int numB;

	public Pair(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
	}

	public int getNumA() {
		return numA;
	}

	public void setNumA(int numA) {
		this.numA = numA;
	}

	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	public static Function<Pair, Pair> getResultScore = p -> {
		if (p.numA > p.numB) {
			p.numA += p.numB;
			p.numB = 0;
		}
		if (p.numA < p.numB) {
			p.numB += p.numA;
			p.numA = 0;
		}
		return p;
	};
}

public class Main {
	public static void main(String[] args) {
		solve0500();
	}

	public static void solve0500() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (0 == n) {
				break;
			}

			Set<Pair> datasets = new HashSet<Pair>();
			for (int i = 0; i < n; i++) {
				datasets.add(new Pair(sc.nextInt(), sc.nextInt()));
			}
			datasets = datasets.stream().map(Pair.getResultScore).collect(Collectors.toSet());
			System.out.println(datasets.stream().mapToInt(p -> p.getNumA()).sum() + " "
					+ datasets.stream().mapToInt(p -> p.getNumB()).sum());
		}

		sc.close();
	}

}

