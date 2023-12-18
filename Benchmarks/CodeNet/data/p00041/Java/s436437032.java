import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class Main {

	static int[][] table = new int[][] {
							{0, 1, 2, 3},
							{0, 1, 3, 2},
							{0, 2, 1, 3},
							{0, 2, 3, 1},
							{0, 3, 1, 2},
							{0, 3, 2, 1},
							{1, 0, 2, 3},
							{1, 0, 3, 2},
							{1, 2, 0, 3},
							{1, 2, 3, 0},
							{1, 3, 0, 2},
							{1, 3, 2, 0},
							{2, 0, 1, 3},
							{2, 0, 3, 1},
							{2, 1, 0, 3},
							{2, 1, 3, 0},
							{2, 3, 0, 1},
							{2, 3, 1, 0},
							{3, 0, 1, 2},
							{3, 0, 2, 1},
							{3, 1, 0, 2},
							{3, 1, 2, 0},
							{3, 2, 0, 1},
							{3, 2, 1, 0}};

	static int[][] table_pattern = new int[][] {
							{0,1,2,3,4,5,6},
							{0,1,2,4,3,5,6},
							{0,1,4,2,3,5,6},
							{0,1,4,2,5,3,6}};

	public static int calcRPN (String[] sa) {
		Queue<String> rpn_que = new ArrayDeque<String>();
		for (int i = 0; i < sa.length ; i++) rpn_que.offer(sa[i]);

		Stack<Integer> calc_stack = new Stack<Integer>();
		while (!rpn_que.isEmpty()) {
			String term = rpn_que.poll();
			int a = 0, b = 0;
			switch (term.charAt(0)) {
			case '+':
				b = calc_stack.pop(); a = calc_stack.pop();
				calc_stack.push(a + b);
				break;
			case '-':
				b = calc_stack.pop(); a = calc_stack.pop();
				calc_stack.push(a - b);
				break;
			case '*':
				b = calc_stack.pop(); a = calc_stack.pop();
				calc_stack.push(a * b);
				break;
			case '/':
				b = calc_stack.pop(); a = calc_stack.pop();
				if (b == 0) {
				return(0);
				}
				calc_stack.push(a / b);
				break;
			default:
				calc_stack.push(Integer.parseInt(term));
				break;
			}
		}
		return(calc_stack.pop());
	}

	public static String RpnToInfix(String[] expression) {
		Stack<String> stack = new Stack<String>();
		int length = expression.length;
		String pre, post;
		for (int i = 0 ; i < length ; i++) {
			switch (expression[i].charAt(0)) {
			default: stack.push(expression[i]); break;
			case '+':
				post = stack.pop(); pre = stack.pop();
				stack.push("("+pre+" + "+post+")"); break;
			case '-':
				post = stack.pop(); pre = stack.pop();
				stack.push("("+pre+" - "+post+")"); break;
			case '*':
				post = stack.pop(); pre = stack.pop();
				stack.push("("+pre+" * "+post+")"); break;
			case '/':
				post = stack.pop(); pre = stack.pop();
				stack.push("("+pre+" / "+post+")"); break;
			}
		}
		return stack.pop();
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();
			if (line.equals("0 0 0 0")) break;
			String[] terms_org = line.split("\\s");
			String[] terms, expr = null;

			boolean isFound = false;
			LOOP:
			for (int i = 0 ; i < 24 ; i++) { // 数値の順列
				terms = new String[7];
				for (int j = 0 ; j < 4 ; j++) terms[j] = terms_org[table[i][j]];

				for (int j = 0 ; j < 27 ; j++) { // 演算子の順列
					String ops = String.format("%03d", Integer.parseInt(Integer.toString(j, 3)));
					for (int k = 0 ; k < 3 ; k++) {
						switch (ops.charAt(k)) {
						case '0': terms[k+4] = "+"; break;
						case '1': terms[k+4] = "-"; break;
						case '2': terms[k+4] = "*"; break;
						}
					}

					for (int k = 0 ; k < 4 ; k++) {// 演算子挿入位置のパターン
						expr = new String[7];
						for (int l = 0 ; l < 7 ; l++) expr[l] = terms[table_pattern[k][l]];
						//for (int l = 0 ; l < 7 ; l++) System.out.print(expr[l]+" ");
						//System.out.print("= "+calcRPN(expr));
						//System.out.print("\n");
						if (10 == calcRPN(expr)) {
							//for (int l = 0 ; l < 7 ; l++) System.out.print(expr[l]+" ");
							isFound = true;
							break LOOP;
						}
					}
				}
			} // END_OF_LOOP
			if (isFound) {
				System.out.println(RpnToInfix(expr));
			} else {
				System.out.println(0);
			}
		}

	}

}