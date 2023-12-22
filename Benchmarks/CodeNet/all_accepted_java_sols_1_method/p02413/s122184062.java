import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] frame = {scan.nextInt() , scan.nextInt()};
		int y = frame[0];
		int x = frame[1];
		int total = 0;
		int[][] sheet = new int[y + 1][x + 1];
		for(int i = 0; i < y; i++) {
			for(int n = 0; n < x; n++) {
				int z = scan.nextInt();
				sheet[i][n] = z;
				total += z;
			}
		}
		//SumRow
		for(int i = 0; i < y; i++) {
			int sumRow = 0;
			for(int n = 0; n < x; n++) {
				sumRow += sheet[i][n];
			}
			sheet[i][x] = sumRow;
		}
		//SumColumn
		for(int i = 0; i < x; i++) {
			int sumCol = 0;
			for(int n = 0; n < y; n++) {
				sumCol += sheet[n][i];
			}
			sheet[y][i] = sumCol;
		}
		//print sheet
		for(int i = 0; i <= y; i++) {
			for(int n = 0; n <= x; n++) {
				if(i == y && n == x) {
					sb.append(total);
				} else {
				    sb.append(sheet[i][n]);
				
				}
				if(n != x)sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}

