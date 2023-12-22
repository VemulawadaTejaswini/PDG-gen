import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product solver = new Product();
		solver.readInput();
		solver.solve();
		solver.writeAnswer();
	}


	static class Product {

		private int input_a;
		private int input_b;

		private String answer;

		private Scanner scanner;
		public Product() {
			this.scanner = new Scanner(System.in);
		}
		public void readInput() {
			this.input_a = scanner.nextInt();
			this.input_b = scanner.nextInt();
		}
		public void solve() {
			Integer m = input_a * input_b;
			if(m%2 == 0) {
				answer = "Even";
			} else {
				answer = "Odd";
			}
		}
		public void writeAnswer() {
			System.out.println(answer);
		}
	}
}
