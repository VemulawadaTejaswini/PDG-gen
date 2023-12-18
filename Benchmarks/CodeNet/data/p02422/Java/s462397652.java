import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		OperationExec op = new OperationExec();
		String str = op.inputWord();
		int q = op.inputNum();
		char[] array = new char[str.length()];
		op.divide(str, array);
		String operation = "";
		short[] viewLength = new short[100];
		short count = 0;
		char[][] stock = new char[100][1000];
		for (int i = 0; i < q; i++) {
			operation = op.inputWord();
			if (operation.equals("replace")) {
				op.replace(array);
			} else if (operation.equals("reverse")) {
				op.reverse(array);
			} else if (operation.equals("print")) {
				op.print(array, stock, count++, viewLength);
			}
		}
		op.print(stock, count, viewLength);
	}
}

class OperationExec {
	Scanner sc;

	public OperationExec() {
		sc = new Scanner(System.in);
	}

	public void print(char[] array, char[][] stockArray, short count, short[] viewLength) {
		short[] q = {sc.nextShort(), sc.nextShort()};
		short i, j;
		for (i = q[0], j = 0; i <= q[1]; i++, j++) {
			stockArray[count][j] = array[i];
		}
		viewLength[count] = j;
	}

	public void print(char[][] stockArray, short count, short[] viewLength) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < viewLength[i]; j++) {
				try {
					System.out.print(stockArray[i][j]);
				} catch (Exception e) {
					break;
				}
			}
			System.out.println();
		}
	}

	public void replace(char[] array) {
		short[] q = {sc.nextShort(), sc.nextShort()};
		String p = sc.next();
		for (int i = q[0], j = 0; i <= q[1]; i++, j++) {
			array[i] = p.charAt(j);
		}
	}

	public void reverse(char[] array) {
		short[] q = {sc.nextShort(), sc.nextShort()};
		char tmp;
		for (int i = q[0]; i <= (q[0] + q[1]) / 2; i++) {
			tmp = array[i];
			array[i] = array[q[0] + q[1] - i];
			array[q[0] + q[1] - i] = tmp;
		}
	}

	public void divide(String str, char[] array) {
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);
		}
	}

	public short inputNum() {
		return sc.nextShort();
	}

	public String inputWord() {
		return sc.next();
	}
}

