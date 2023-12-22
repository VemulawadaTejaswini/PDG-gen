import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		CountingRoads solver = new CountingRoads();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}
	static class CountingRoads {
		private int city[];
		private Scanner scanner;
		private int n;
		private int m;

		public CountingRoads() {
			this.scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			m = Integer.parseInt(scanner.next());
			city = new int[n];
			Arrays.fill(city, 0);
		}
		public void solve() {
			for(int i=0; i<m; i++) {
				for(int j=0; j<2; j++) {
					city[Integer.parseInt(scanner.next())-1]++;
				}
			}
		}

		public void writeOutput() {
			for(int o:city) {
				System.out.println(o);
			}
		}
	}

}