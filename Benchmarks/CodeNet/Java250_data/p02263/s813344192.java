import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MyStack stack = new MyStack();

		while(in.hasNext()) {
			stack.push(in.next());
		}

		System.out.println(stack.peek());
	}

	static class MyStack{
		long[] arr;
		int tail;

		MyStack() {
			arr = new long[100];
			tail = -1;
		}

		void push(String str) {

			try {
				long v = Long.parseLong(str);
				//System.out.println("insert" + v);
                arr[++tail] = v;
                //System.out.println("tail" + tail);
			}catch(Exception e) {
                //System.out.println("calc operetion requested");
				char op = str.charAt(0);

				switch(op) {
					case '+': 
						long eq1 = arr[tail - 1] + arr[tail];
                        arr[tail - 1] = eq1;
                        tail--;
						break;

					case '-':
						long eq2 = arr[tail - 1] - arr[tail];
						arr[--tail] = eq2;
						break;

					case '*':
						long eq3 = arr[tail - 1] * arr[tail];
						arr[--tail] = eq3;
						break;
				}
			}
		}

		long peek() {
			return arr[tail];
		}
	}

}

