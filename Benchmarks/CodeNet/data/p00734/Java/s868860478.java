import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			int [] a = new int[n];
			int [] b = new int[m];
			int asum = 0, bsum = 0;
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
				asum += a[i];
			}
			for(int i = 0; i < m; i++){
				b[i] = sc.nextInt();
				bsum += b[i];
			}
			
			int ansmin = INF, ansA = -1, ansB = -1;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					int anow = asum + b[j] - a[i];
					int bnow = bsum + a[i] - b[j];
					if(anow == bnow){
						if(ansmin > a[i] + b[j]){
							ansmin = a[i] + b[j];
							ansA = a[i];
							ansB = b[j];
						}
					}
				}
			}
			System.out.println(ansmin == INF ? -1 : ansA + " " + ansB);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}