import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static class Dice {
		private String top;
		private String bottom;
		private String front;
		private String back;
		private String left;
		private String right;

		public Dice(
				String top,
				String front,
				String right,
				String left,
				String back,
				String bottom)
		{
			this.top = top;
			this.front = front;
			this.right = right;
			this.left = left;
			this.back = back;
			this.bottom = bottom;
		}

		public String operationE() {
			String tmp = this.top;
			this.top = this.left;
			this.left = this.bottom;
			this.bottom = this.right;
			this.right = tmp;

			return this.top;
		}

		public String operationN() {
			String tmp = this.top;
			this.top = this.front;
			this.front = this.bottom;
			this.bottom = this.back;
			this.back = tmp;

			return this.top;
		}

		public String operationS() {
			String tmp = this.top;
			this.top = this.back;
			this.back = this.bottom;
			this.bottom = this.front;
			this.front = tmp;

			return this.top;
		}

		public String operationW() {
			String tmp = this.top;
			this.top = this.right;
			this.right = this.bottom;
			this.bottom = this.left;
			this.left = tmp;

			return this.top;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] label = br.readLine().split(" ");
		Dice dice = new Dice(label[0], label[1], label[2], label[3], label[4], label[5]);

		String text = br.readLine();

		String result = label[0];
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'E') {
				result = dice.operationE();
			} else if (text.charAt(i) == 'N') {
				result = dice.operationN();
			} else if (text.charAt(i) == 'S') {
				result = dice.operationS();
			} else if (text.charAt(i) == 'W') {
				result = dice.operationW();
			}
		}
		System.out.println(result);
	}
}