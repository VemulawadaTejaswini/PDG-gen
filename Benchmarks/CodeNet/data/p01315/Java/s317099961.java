import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int N = scanner.nextInt();
			if (N == 0) {
				break;
			}

			ArrayList<Plant> plants = new ArrayList<Plant>();
			for (int i = 0; i < N; i++) {
				String name = scanner.next();
				int P = scanner.nextInt();
				int A = scanner.nextInt();
				int B = scanner.nextInt();
				int C = scanner.nextInt();
				int D = scanner.nextInt();
				int E = scanner.nextInt();
				int F = scanner.nextInt();
				int S = scanner.nextInt();
				int M = scanner.nextInt();

				int cost = A + B + C + (D + E) * M;
				int gain = F * S * M - P;

				plants.add(new Plant(name, gain, cost));
			}

			Collections.sort(plants);
			for (Plant plant : plants) {
				System.out.println(plant.name);
			}
			System.out.println("#");

		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}

class Plant implements Comparable<Plant> {
	int id, gain, cost;
	String name;

	Plant(String name, int gain, int cost) {
		this.name = name;
		this.gain = gain;
		this.cost = cost;
	}

	@Override
	public int compareTo(Plant p) {
		int diff = p.gain * this.cost - this.gain * p.cost;
		if (diff == 0) {
			return this.name.compareTo(p.name);
		}

		return diff;// 降順
	}
}