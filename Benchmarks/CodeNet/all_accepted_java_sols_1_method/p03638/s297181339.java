import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] field = new int[h][w];
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int hh = 0;
		int ww = 0;
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < arr[i]; j++) {
		        field[hh][ww] = i + 1;
		        if(hh % 2 == 0) {
		            if (ww == w - 1) {
		                hh++;
		            } else {
		                ww++;
		            }
		        } else {
		            if (ww == 0) {
		                hh++;
		            } else {
		                ww--;
		            }
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (j != 0) {
		            sb.append(" ");
		        }
		        sb.append(field[i][j]);
		    }
		    sb.append("\n");
		}
	    System.out.print(sb);
   }
}


