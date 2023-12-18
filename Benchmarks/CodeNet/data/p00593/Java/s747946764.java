import java.util.Scanner;

public class Main {
 private static final Integer END_FLAG = Integer.valueOf(0);
 static Scanner               in       = new Scanner(
	                                       System.in);
 static Integer               nextValue;

 public static void main(String[] args) {
	int caseNum = 0;
	do {
	 int n = (nextValue != null) ? nextValue : in.nextInt();
	 printCase(++caseNum);
	 int[][] jpeg = new int[n][n];
	 int x = 0;
	 final int lastX = n * n;
	 final int lastIndex = n - 1;
	 int column = 0, row = 0;
	 int nextStartColumn = 0, nextStartRow = 0, d = 1;
	 while (x < lastX) {
		column = nextStartColumn;
		row = nextStartRow;
		while (0 <= column && column < n && 0 <= row && row < n) {
		 jpeg[column][row] = ++x;
		 nextStartColumn = column;
		 nextStartRow = row;
		 column -= d;
		 row += d;
		}
		if (nextStartColumn == lastIndex || (nextStartColumn == 0 && nextStartRow != lastIndex)) {
		 nextStartRow++;
		} else if (nextStartRow == lastIndex || (nextStartRow == 0 && nextStartColumn != lastIndex)) {
		 nextStartColumn++;
		}

		d = -d;
	 }
	 for (column = 0; column < n; column++) {
		for (row = 0; row < n; row++) {
		 System.out.print(jpeg[column][row]);
		 if (row < lastIndex) {
			System.out.print(' ');
		 } else {
			System.out.println();
		 }
		}
	 }
	 nextValue = Integer.valueOf(in.next());
	} while (!nextValue.equals(END_FLAG));
 }

 private static void printCase(int caseNum) {
	System.out.print("Case ");
	System.out.print(caseNum);
	System.out.println(':');
 }
}