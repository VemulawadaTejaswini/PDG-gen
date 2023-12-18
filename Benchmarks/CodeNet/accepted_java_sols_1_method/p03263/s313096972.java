import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] field = new int[h][w];
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        field[i][j] = sc.nextInt();
		    }
		}
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int total = 0;
		int hh = 0;
		int ww = 0;
		while (count < h * w - 1) {
	        int nh;
	        int nw;
	        if (hh % 2 == 0) {
	            if (ww == w - 1) {
	                nh = hh + 1;
	                nw = ww;
	            } else {
	                nh = hh;
	                nw = ww + 1;
	            }
	        } else {
	            if (ww == 0) {
	                nh = hh + 1;
	                nw = ww;
	            } else {
	                nh = hh;
	                nw = ww - 1;
	            }
	        }
		    if (field[hh][ww] % 2 == 1) {
		        field[hh][ww]--;
		        field[nh][nw]++;
		        sb.append(hh + 1).append(" ").append(ww + 1).append(" ").append(nh + 1).append(" ").append(nw + 1).append("\n");
		        total++;
		    }
		    hh = nh;
		    ww = nw;
		    count++;
		}
		System.out.println(total);
		System.out.print(sb);
	}
	
}
