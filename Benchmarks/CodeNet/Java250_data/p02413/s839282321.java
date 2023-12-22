import java.util.Scanner;

public class Main {
	static int[][] array;
	public static void main(String[] args) {
		// r = ???, c = ?即?
		int r, c;
		Scanner sc = new Scanner(System.in);
		r = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());
		r += 1;
		c += 1;
		array = new int[r][c];
		for (int i=0; i < r; i++) {
			for (int j=0; j < c; j++) {
				if (i == r-1) {
					array[i][j] = getCsum(j, i);
				} else if (j == c-1) {
					array[i][j] = getRsum(i, j);
				} else {
					array[i][j] = Integer.parseInt(sc.next());
				}
			}
		}
		sc.close();
		for (int i=0; i < r; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j=0; j < c; j++) {
				sb.append(array[i][j]).append(' ');
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println(sb);
		}
	}
	static final int getRsum(int num, int cSize) {
		int sum = 0;
		for (int i=0; i < cSize; i++) {
			sum = sum + array[num][i];
		}
		return sum;
	}
	static final int getCsum(int num, int rSize) {
		int sum = 0;
		for (int i=0; i < rSize; i++){
			sum = sum + array[i][num];
		}
		return sum;
	}
}