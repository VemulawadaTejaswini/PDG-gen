import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (; sc.hasNextLine();) {

			String in = sc.nextLine();

			String[] token = in.split(" ");

			LinkedList<Double> stack = new LinkedList<Double>();

			for (int i = 0; i < token.length; i++) {

				if (token[i].toCharArray().length == 0) {

					continue;

				}

				if (token[i].toCharArray().length == 1

						&& !Character.isDigit(token[i].toCharArray()[0])) {

					double b = stack.removeLast();

					double a = stack.removeLast();

					switch (token[i].toCharArray()[0]) {

					case '+':

						stack.addLast(a + b);

						break;

					case '-':

						stack.addLast(a - b);

						break;

					case '*':

						stack.addLast(a * b);

						break;

					case '/':

						stack.addLast(a / b);

						break;

					}

				} else {

					stack.addLast(Double.valueOf(token[i]));

				}

			}

			System.out.println(stack.get(0));

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}