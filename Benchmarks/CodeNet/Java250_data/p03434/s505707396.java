import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		CardGameForTwo solver = new CardGameForTwo();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class CardGameForTwo {

		private int n;
		private Stack a;
		private int output;

		private Scanner scanner;

		public CardGameForTwo() {
			scanner = new Scanner(System.in);
			a = new Stack();
			output = 0;
		}

		public void readInput() {
			n = scanner.nextInt();
			for(int i=0; i<n; i++) {
				a.push(scanner.nextInt());
			}
		}

		public  void solve() {
			Collections.sort(a);
			int alice = 0;
			int bob = 0;
			while(!a.isEmpty()) {
				alice += (int) a.pop();
				if(a.isEmpty()) {
					break;
				}
				bob += (int) a.pop();
			}
			output = alice - bob;
		}
		public void writeOutput() {
			System.out.println(output);
		}

	}

}
