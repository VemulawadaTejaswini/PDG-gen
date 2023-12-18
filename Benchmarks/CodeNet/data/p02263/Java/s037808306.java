import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StackControler readDataArr = new StackControler(in.readLine()
				.split(" "));
		System.out.println(readDataArr.calcData());
	}
}

class Stack {
	private int[] stack;
	private static int pointer = 0, popData, remover = 0;

	Stack(int[] stack) {
		this.stack = stack;
	}

	public void push(int data) {
		stack[pointer] = data;
		pointer++;
	}

	public int pop() {
		pointer--;
		popData = stack[pointer];
		stack[pointer] = remover;// pop????????????data?????????
		return popData;
	}

}

class StackControler {
	private Stack stack;
	private String[] readData;
	private int operand2, operand1, result, strToIntData;

	StackControler(String[] readData) {
		this.readData = readData;
	}

	public int calcData() {
		String tempStrData;
		stack = new Stack(new int[readData.length / 2 + 1]);
		for (int i = 0; i < readData.length; i++) {
			tempStrData = readData[i];

			if (tempStrData.equals("+")) {
				operand1 = stack.pop();
				operand2 = stack.pop();
				result = operand2 + operand1;
				stack.push(result);
			} else if (tempStrData.equals("-")) {
				operand1 = stack.pop();
				operand2 = stack.pop();
				result = operand2 - operand1;
				stack.push(result);
			} else if (tempStrData.equals("*")) {
				operand1 = stack.pop();
				operand2 = stack.pop();
				result = operand2 * operand1;
				stack.push(result);
			} else {
				strToIntData = Integer.parseInt(readData[i]);
				stack.push(strToIntData);
			}
		}
		result = stack.pop();
		return result;
	}
}