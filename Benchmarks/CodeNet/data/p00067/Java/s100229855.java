import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(
	  new InputStreamReader(System.in));
  boolean hasNext = true;
  while (hasNext) {
	int[][] before = new int[12][];
	int[][] line = new int[12][];
	int count = 0, num = 0;
	int[][] old = null;
	char[] read = new char[12];
	for (int col = 0; col < 12; col++) {
	  old = before;
	  before = line;
	  line = old;
	  br.read(read);
	  for (int row = 0; row < 12; row++) {
		if (read[row] == '1') {
		  boolean upperHas = before[row] != null;
		  boolean leftHas = row != 0 && line[row - 1] != null;
		  if (!(upperHas || leftHas)) {
			line[row] = new int[] { num++ };
			count++;
		  } else if (leftHas) {
			line[row] = line[row - 1];
			if (upperHas && line[row][0] != before[row][0]) {
			  line[row][0] = before[row][0];
			  count--;
			}
		  } else if (upperHas) {
			line[row] = before[row];
		  }
		}
		else {
		  line[row] = null;
		}
	  }
	  br.readLine();
	}
	System.out.print(count);
	hasNext = br.readLine() != null;
	if (hasNext) {
	  System.out.print(" ");
	} else {
	  System.out.println();
	}
  }
}
}