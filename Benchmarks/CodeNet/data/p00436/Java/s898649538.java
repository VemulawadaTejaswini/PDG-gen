
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n= sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();
			int[][] card = new int[m+1][2*n];
			for(int i=0;i<2*n;i++) card[0][i] = i+1;
			for(int i=1;i<=m;i++) {
				int k = sc.nextInt();
				if(k == 0) {
					for(int j=0;j<n;j++) {
						card[i][2*j] = card[i-1][j];
						card[i][2*j+1] = card[i-1][n+j];
					}
				}
				else {
					for(int j=k;j<2*n;j++)card[i][j-k] = card[i-1][j];
					for(int j=0;j<k;j++) card[i][2*n-k+j] = card[i-1][j];
				}
			}
			for(int i=0;i<2*n;i++) System.out.println(card[m][i]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}