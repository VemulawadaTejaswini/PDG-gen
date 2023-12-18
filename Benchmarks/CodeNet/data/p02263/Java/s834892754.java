import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static class Stack {

		private int [] data;
		private int top;

		// ????????????Stack stack = new Stack(?????????????????????);???
		public Stack(int stackSize) {
			this.data = new int[stackSize];
			this.top = 0;
		}

		// ?????????????????????????????????????????????
		// ????????????
		// stack.push(?????????);
		public void push(int pushData) {
			this.data[this.top] = pushData;
			this.top++;
		}

		// ??????????????????????????????????????????????????????
		// ????????????
		// int data = stack.pop();
		public int pop() {
			this.top--;
			int popData = this.data[this.top];

			return popData;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] formula = br.readLine().split(" ");

		Stack stack = new Stack(100);

		for(int i = 0; i < formula.length; i++) {
			if(!formula[i].equals("+") && !formula[i].equals("-") && !formula[i].equals("*")) {
				stack.push(Integer.parseInt(formula[i]));
			} else {
				if(formula[i].equals("+")) {
					int popNum1 = stack.pop();
					int popNum2 = stack.pop();

					int formulaResult = popNum2 + popNum1;

					stack.push(formulaResult);
				} else if(formula[i].equals("-")) {
					int popNum1 = stack.pop();
					int popNum2 = stack.pop();

					int formulaResult = popNum2 - popNum1;

					stack.push(formulaResult);
				} else if(formula[i].equals("*")) {
					int popNum1 = stack.pop();
					int popNum2 = stack.pop();

					int formulaResult = popNum2 * popNum1;

					stack.push(formulaResult);
				}
			}
		}
		System.out.println(stack.pop());
	}
}