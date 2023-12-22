import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] rc = br.readLine().split(" ");
		int r = Integer.parseInt(rc[0]);
		int c = Integer.parseInt(rc[1]);
		int sumOfRow, total = 0;
		int[] sumOfCol = new int[c];

		for(int i = 0; i < r; i++) {
			String row = br.readLine();
			String[] elem = row.split(" ");
			sumOfRow = 0;
			for(int j = 0; j < c; j++) {
				sumOfRow += Integer.parseInt(elem[j]);
				sumOfCol[j] += Integer.parseInt(elem[j]);
			}
			total += sumOfRow;
			sb.append(row + " " + sumOfRow + "\n");
		}

		for(int j = 0; j < c; j++) {
			sb.append(sumOfCol[j] + " ");
		}

		System.out.println(sb.append(total));

	}
}