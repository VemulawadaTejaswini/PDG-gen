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
		private int n;
		private int m;

		private int a[];
		private int b[];

		private Scanner scanner;
		private int output[];

		public CountingRoads() {
			scanner = new Scanner(System.in);

		}
		public void readInput() {
			n = scanner.nextInt();
			m = scanner.nextInt();

			output = new int[n];
			Arrays.fill(output, 0);

			for(int i=0; i<m; i++) {
				for(int j=0; j<2; j++) {
					output[scanner.nextInt()-1]++;
				}
			}

		}

		public void solve() {
		}
		public void writeOutput() {
			for(int o:output) {
				System.out.println(o);
			}
		}
	}

}
