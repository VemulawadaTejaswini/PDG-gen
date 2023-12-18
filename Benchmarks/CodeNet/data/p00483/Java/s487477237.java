import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] mapA = new int[m+1][n+1];
		int[][] mapB = new int[m+1][n+1];
		int[][] mapC = new int[m+1][n+1];
		for(int i = 0; i < m; i++) {
			char[] in = sc.next().toCharArray();
			for(int j = 0; j < n; j++) {
				if(in[j] == 'J') mapA[i+1][j+1] = 1;
				if(in[j] == 'O') mapB[i+1][j+1] = 1;
				if(in[j] == 'I') mapC[i+1][j+1] = 1;
			}
		}
		for(int i = 0; i < m+1; i++) {
			for(int j = 1; j < n+1; j++) {
				mapA[i][j] += mapA[i][j-1];
				mapB[i][j] += mapB[i][j-1];
				mapC[i][j] += mapC[i][j-1];
			}
		}
		for(int i = 0; i < n+1; i++) {
			for(int j = 1; j < m+1; j++) {
				mapA[j][i] += mapA[j-1][i];
				mapB[j][i] += mapB[j-1][i];
				mapC[j][i] += mapC[j-1][i];
			}
		}
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			System.out.print((mapA[c][d] + mapA[a-1][b-1] - mapA[a-1][d] - mapA[c][b-1]));
			System.out.print(" " + (mapB[c][d] + mapB[a-1][b-1] - mapB[a-1][d] - mapB[c][b-1]));
			System.out.print(" " + (mapC[c][d] + mapC[a-1][b-1] - mapC[a-1][d] - mapC[c][b-1]));
			System.out.println();
		}
		
		
		
	}
	
	
	
}