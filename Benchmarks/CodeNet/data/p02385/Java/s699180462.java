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

		private boolean topAndBottom(String topNum, String bottomNum) {
				for(int i = 0; i < 2; i++){
				this.operationW();
				}
				if ((this.top.equals(topNum)) && (this.bottom.equals(bottomNum))) {
					return true;
				}
				return false;
		}

		private boolean frontAndBack(String frontNum, String backNum) {
				for(int i = 0; i < 2; i++) {
				this.operationS();
				}
				if ((this.top.equals(frontNum)) && (this.bottom.equals(backNum))){
					return true;
				}
				return false;
			}

		private boolean rightAndLeft(String rightNum, String leftNum) {
				for(int i = 0; i < 2; i++) {
				this.operationW();
				}
				if ((this.right.equals(rightNum)) && (this.left.equals(leftNum))){
					return true;
				}
				return false;
			}
		}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] label1 = br.readLine().split(" ");
		String[] label2 = br.readLine().split(" ");

		Dice dice1 = new Dice(label1[0], label1[1], label1[2], label1[3], label1[4], label1[5]);
		Dice dice2 = new Dice(label2[0], label2[1], label2[2], label2[3], label2[4], label2[5]);
		
		if(!(label1[0] == label2[0]) && ((label1[5] == label2[5]))){
			dice2.topAndBottom(label2[0], label2[5]);
		}
		if (true){
		System.out.println("Yes");
		}
	}
}