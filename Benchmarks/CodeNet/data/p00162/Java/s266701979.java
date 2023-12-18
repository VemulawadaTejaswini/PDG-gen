import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	double EPS = 1.0e-08;
	int MAX = 1000000;
	int [] acc;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		init();
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();
			int ans = acc[m] - acc[n-1];
			System.out.println(ans);
		}
	}
	
	private void init(){
		acc = new int[MAX + 1];
		boolean [] isH = new boolean[MAX+1];
		isH[1] = true;
		for(int i = 1; i <= MAX; i++){
			if(isH[i]){
				for(int j = 2; j <= 5; j++){
					if(j == 4) continue;
					int ind = i * j;
					if(ind > MAX) break;
					isH[ind] = true;
				}
				acc[i] += acc[i-1] + 1;
			}
			else{
				acc[i] += acc[i-1];
			}
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}