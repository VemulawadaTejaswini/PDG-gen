import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] dist = new int[10][10];
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		        dist[i][j] = sc.nextInt();
		    }
		}
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		        for (int k = 0; k < 10; k++) {
		            dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
		        }
		    }
		}
		long total = 0;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        int x = sc.nextInt();
		        if (x != -1) {
		            total += dist[x][1];
		        }
		    }
		}
        System.out.println(total);
   }
}


