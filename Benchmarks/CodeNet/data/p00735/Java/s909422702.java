import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	int INF = 1 << 24;
	int MAX = 300000 + 1000;
	boolean [] isMS = new boolean[MAX + 1];
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		init();
		while(true){
			int n = sc.nextInt();
			if(n == 1) break;
			System.out.print( n + ":");
			for(int i = 0; i * 7 < n; i++){
				int a = i * 7 + 1;
				if(a != 1 && a <= n && n % a == 0 && isMS[a]){
					System.out.print(" " + a);
				}
				int b = i * 7 + 6;
				if(b <= n && n % b == 0 && isMS[b]){
					System.out.print(" " + b);
				}
			}
			System.out.println();
		}
		
	}

	private void init() {
		
		for(int i = 0; i * 7 < MAX; i++){
			int a = i * 7 + 1;
			if(a != 1 && a < MAX){
				isMS[a] = true;
			}
			int b = i * 7 + 6;
			if(b < MAX){
				isMS[b] = true;
			}
		}
		
		for(int i = 0; i <= MAX; i++){
			if(isMS[i]){
				for(int j = i * 2; j <= MAX; j+= i){
					isMS[j] = false;
				}
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}