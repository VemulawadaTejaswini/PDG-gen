import java.util.*;

class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		final String[] len = sc.nextLine().split(" ");
		final int r = Integer.parseInt(len[0]);
		final int c = Integer.parseInt(len[1]);
		StringBuilder sb = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		int[][] mat = new int[r + 1][c + 1];
		
		for(int i = 0; i < r; i++){
			final String[] col = sc.nextLine().split(" ");
			for(int j = 0; j < c; j++){
				mat[i][j] = Integer.parseInt(col[j]);
				mat[i][c] += mat[i][j];
				mat[r][j] += mat[i][j];
				sb.append(col[j]).append(" ");
			}
			sb.append(mat[i][c]).append(lb);
		}
		for(int i = 0; i < c; i++){
			sb.append(mat[r][i]).append(" ");
			mat[r][c] += mat[r][i];
		}
		sb.append(mat[r][c]).append(lb);
		System.out.print(sb.toString());
	}
}