import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		}
		int[][] verCounts = new int[h][w];
		for (int i = 0; i < h; i++) {
		    if (field[i][0] == '.') {
		        verCounts[i][0] = 1;
		    }
		    for (int j = 1; j < w; j++) {
		        if (field[i][j] == '.') {
		            verCounts[i][j] = verCounts[i][j - 1] + 1;
		        }
		    }
		    for (int j = w - 2; j >= 0; j--) {
		        if (verCounts[i][j] != 0 && verCounts[i][j + 1] != 0) {
		            verCounts[i][j] = verCounts[i][j + 1];
		        }
		    }
		}
		int[][] horCounts = new int[h][w];
		for (int i = 0; i < w; i++) {
		    if (field[0][i] == '.') {
		        horCounts[0][i] = 1;
		    }
		    for (int j = 1; j < h; j++) {
		        if (field[j][i] == '.') {
		            horCounts[j][i] = horCounts[j - 1][i] + 1;
		        }
		    }
		    for (int j = h - 2; j >= 0; j--) {
		        if (horCounts[j][i] != 0 && horCounts[j + 1][i] != 0) {
		            horCounts[j][i] = horCounts[j + 1][i];
		        }
		    }
		}
		int max = 0;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        max = Math.max(max, verCounts[i][j] + horCounts[i][j] - 1);
		    }
		}
	    System.out.println(max);
   }
}


