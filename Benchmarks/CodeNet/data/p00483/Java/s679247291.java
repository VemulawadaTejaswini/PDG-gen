import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int m = sc.nextInt();
		final int n = sc.nextInt();
		
		final int k = sc.nextInt();
		
		char[][] map = new char[m][n];
		
		for(int i = 0; i < m; i++){
			String str = sc.next();
			char[] input = str.toCharArray();
			
			for(int j = 0; j < n; j++){
				map[i][j] = input[j];
			}
			
		}
		
		int[][] js = new int[m][n];
		int[][] os = new int[m][n];
		int[][] is = new int[m][n];
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(i == 0 && j == 0){
					js[i][j] += map[i][j] == 'J' ? 1 : 0;
					os[i][j] += map[i][j] == 'O' ? 1 : 0;
					is[i][j] += map[i][j] == 'I' ? 1 : 0;
				}else if(i == 0){
					js[i][j] += js[i][j-1] + (map[i][j] == 'J' ? 1 : 0);
					os[i][j] += os[i][j-1] + (map[i][j] == 'O' ? 1 : 0);
					is[i][j] += is[i][j-1] + (map[i][j] == 'I' ? 1 : 0);
				}else if(j == 0){
					js[i][j] += js[i-1][j] + (map[i][j] == 'J' ? 1 : 0);
					os[i][j] += os[i-1][j] + (map[i][j] == 'O' ? 1 : 0);
					is[i][j] += is[i-1][j] + (map[i][j] == 'I' ? 1 : 0);
				}else{
					js[i][j] += js[i-1][j] + js[i][j-1] - js[i-1][j-1] + (map[i][j] == 'J' ? 1 : 0);
					os[i][j] += os[i-1][j] + os[i][j-1] - os[i-1][j-1] + (map[i][j] == 'O' ? 1 : 0);
					is[i][j] += is[i-1][j] + is[i][j-1] - is[i-1][j-1] + (map[i][j] == 'I' ? 1 : 0);
				}
			}
		}
		
		for(int i = 0; i < k; i++){
			final int y1 = sc.nextInt()-1;
			final int x1 = sc.nextInt()-1;
			final int y2 = sc.nextInt()-1;
			final int x2 = sc.nextInt()-1;
			
			int J = 0, O = 0, I = 0;
			
			if(x1 == 0 && y1 == 0){
				J = js[y2][x2];
				O = os[y2][x2];
				I = is[y2][x2];
			}else if(x1 == 0){
				J = js[y2][x2] - js[y1-1][x2];
				O = os[y2][x2] - os[y1-1][x2];
				I = is[y2][x2] - is[y1-1][x2];
			}else if(y1 == 0){
				J = js[y2][x2] - js[y2][x1-1];
				O = os[y2][x2] - os[y2][x1-1];
				I = is[y2][x2] - is[y2][x1-1];
			}else{
				J = js[y2][x2] - js[y2][x1-1] - js[y1-1][x2] + js[y1-1][x1-1];
				O = os[y2][x2] - os[y2][x1-1] - os[y1-1][x2] + os[y1-1][x1-1];
				I = is[y2][x2] - is[y2][x1-1] - is[y1-1][x2] + is[y1-1][x1-1];
			}
			
			System.out.println(J + " " + O + " " + I);
		}
		
	}

}