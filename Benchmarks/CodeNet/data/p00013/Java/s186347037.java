import java.util.Scanner;

class Stack {

	int top;
	int[] stack;
	int size;

	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}


	public void push(int value) {
		stack[++top] = value;
	}

	public int pop() {
		System.out.println(stack[top]);
		return stack[top--];
	}

}

public class Main {


	public static void main(String args[]) {
		int number;

		Stack st = new Stack(10);

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {

			number = sc.nextInt();

			if(number != 0) {
				st.push(number);
			}

			else {
				st.pop();
			}

		}

	}

}