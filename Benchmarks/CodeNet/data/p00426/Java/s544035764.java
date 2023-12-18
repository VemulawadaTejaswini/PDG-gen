
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class Main {

	static Stack<Integer> stackA;
	static Stack<Integer> stackB;
	static Stack<Integer> stackC;
	static Stack<Integer> stackA2;
	static Stack<Integer> stackB2;
	static Stack<Integer> stackC2;

	static int step = 0;
	static int prevMoveType = 1;
	static int N;
	static int M;

	static BufferedReader br;

	public static void main(String[] args) throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			init();
			if (!inputData()) {
				break;
			}

			//System.out.println(dump());

			boolean isFinishedR = false;
			boolean isFinishedL = false;

			int min = 0;

			prevMoveType = +1;
			while (step <= M) {
				if (isFinished(step)) {
					isFinishedR = true;
					//System.out.println("+1で成功！カウント＝" + step);
					min = step;
					break;
				}
				if (prevMoveType > 0) {
					moveLeft(step);
				} else {
					moveRight(step);
				}
				prevMoveType *= -1;
				step++;
				//System.out.println(dump());
			}

			if (!isFinishedR) {
				//System.out.println("＋１では失敗！");
			}

			prevMoveType = -1;
			step = 0;
			stackA = stackA2;
			stackB = stackB2;
			stackC = stackC2;

			while (step <= M) {
				if (isFinished(step)) {
					isFinishedL = true;
					//System.out.println("-1で成功！カウント＝" + step);
					min = Math.min(min, step);
					break;
				}
				if (prevMoveType > 0) {
					moveLeft(step);
				} else {
					moveRight(step);
				}
				prevMoveType *= -1;
				step++;
				//System.out.println(dump());
			}
			if (!isFinishedL) {
				//System.out.println("-１では失敗！");
			}

			if (isFinishedL || isFinishedR) {
				//System.out.println("最小手数 = " + min);
				System.out.println(min);
			} else {
				//System.out.println("失敗");
				System.out.println(-1);
			}
		}

	}

	static void init() {
		stackA = new Stack<Integer>();
		stackB = new Stack<Integer>();
		stackC = new Stack<Integer>();

		stackA2 = new Stack<Integer>();
		stackB2 = new Stack<Integer>();
		stackC2 = new Stack<Integer>();

		step = 0;
	}

	static boolean inputData() throws IOException {
		String input = br.readLine();
		//System.out.println("入力NM = " + input);
		String[] nm = input.split(" ");
		N = Integer.parseInt(nm[0]);
		M = Integer.parseInt(nm[1]);

		if (N == 0 && M == 0) {
			return false;
		}

		String[] dataA = br.readLine().split(" ");
		int numData = Integer.parseInt(dataA[0]);
		for (int i = 0; i < numData; i++) {
			stackA.push(Integer.parseInt(dataA[i + 1]));
			stackA2.push(Integer.parseInt(dataA[i + 1]));
		}

		String[] dataB = br.readLine().split(" ");
		numData = Integer.parseInt(dataB[0]);
		for (int i = 0; i < numData; i++) {
			stackB.push(Integer.parseInt(dataB[i + 1]));
			stackB2.push(Integer.parseInt(dataB[i + 1]));
		}

		String[] dataC = br.readLine().split(" ");
		numData = Integer.parseInt(dataC[0]);
		for (int i = 0; i < numData; i++) {
			stackC.push(Integer.parseInt(dataC[i + 1]));
			stackC2.push(Integer.parseInt(dataC[i + 1]));
		}

		return true;
	}

	static boolean moveLeft(int count) {
		int A = stackA.empty() ? 0 : stackA.peek();
		int B = stackB.empty() ? 0 : stackB.peek();

		if (A >= B) {
			return moveAB();
		} else {
			return moveBA();
		}
	}

	static boolean moveRight(int count) {
		int B = stackB.empty() ? 0 : stackB.peek();
		int C = stackC.empty() ? 0 : stackC.peek();
		if (B >= C) {
			return moveBC();
		} else {
			return moveCB();
		}
	}

	static boolean isFinished(int step) {
		if (!stackB.empty()) {
			return false;
		}
		if (stackA.empty() || stackC.empty()) {
			return true;
		} else {
			return false;
		}
	}


	static boolean moveAB() {
		//System.out.println("moveAB()");
		int A = stackA.pop();
		stackB.push(A);
		return true;
	}

	static boolean moveBC() {
		//System.out.println("moveBC()");
		int B = stackB.pop();
		stackC.push(B);
		return true;
	}

	static boolean moveBA() {
		//System.out.println("moveBA()");
		int B = stackB.pop();
		stackA.push(B);
		return true;
	}

	static boolean moveCB() {
		//System.out.println("moveCB()");
		int C = stackC.pop();
		stackB.push(C);
		return true;
	}

	static String dump() {
		StringBuilder dump = new StringBuilder();
		dump.append(stackA.toString());
		dump.append("\n");
		dump.append(stackB.toString());
		dump.append("\n");
		dump.append(stackC.toString());
		dump.append("\n=======================================\n");

		return dump.toString();
	}
}