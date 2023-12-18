import java.util.*;
import java.util.Map.Entry;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] matrix = new boolean[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt() == 1?true:false;
			}
		}
		for(int i = 0; i < m; i++) {
			int o = sc.nextInt();
			if(o == 0) {
				int r = sc.nextInt()-1;
				int c = sc.nextInt()-1;
				int size = sc.nextInt();
				int angle = sc.nextInt();
				for(int j = 0; j < angle / 90; j++) {
					boolean[][] submatrix = new boolean[size][size];
					for(int k = 0; k < size; k++) {
						for(int l = 0; l < size; l++) {
							submatrix[l][size - k - 1] = matrix[k + r][l + c];
						}
					}
					for(int k = 0; k < size; k++) {
						for(int l = 0; l < size; l++) {
							matrix[k + r][l + c] = submatrix[k][l];
						}
					}
				}
			}
			else if(o == 1) {
				int r = sc.nextInt()-1;
				int c = sc.nextInt()-1;
				int size = sc.nextInt();
				for(int j = 0; j < size; j++) {
					for(int k = 0; k < size; k++) {
						matrix[j + r][k + c] = !matrix[j + r][k + c];
					}
				}
			}
			else if(o == 2) {
				int r = sc.nextInt()-1;
				boolean tmp = matrix[r][0];
				for(int j = 0; j < n-1; j++) {
					matrix[r][j] = matrix[r][j+1];
				}
				matrix[r][n-1] = tmp;
			}
			else if(o == 3) {
				int r = sc.nextInt()-1;
				boolean tmp = matrix[r][n-1];
				for(int j = n-1; j >= 1; j--) {
					matrix[r][j] = matrix[r][j-1];
				}
				matrix[r][0] = tmp;
			}
			else if(o == 4) {
				int r = sc.nextInt()-1;
				int c = sc.nextInt()-1;
				dfs(r,c,matrix,matrix[r][c]);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(matrix[i][0]?1:0);
			for(int j = 1; j < n; j++) {
				System.out.print(" " + (matrix[i][j]?1:0));
			}
			System.out.println();
		}
	}
	
	static int[] vx = {0,1,0,-1};
	static int[] vy = {1,0,-1,0};
	static void dfs(int y, int x, boolean[][] matrix, boolean target) {
		if(matrix[y][x] != target) return;
		matrix[y][x] = !matrix[y][x];
		int n = matrix.length;
		for(int i = 0; i < 4; i++) {
			int ty = y + vy[i];
			int tx = x + vx[i];
			if(ty < 0 || tx < 0 || tx >= n || ty >= n || matrix[ty][tx] != target) continue;
			dfs(ty,tx,matrix,target);
		}
	}
}