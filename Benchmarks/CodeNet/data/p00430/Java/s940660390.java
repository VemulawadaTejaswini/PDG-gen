import java.util.*;
import java.awt.geom.*;

public class Main{
	int [] work;
	int n;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			work = new int[n];
			work[0] = n;
			dfs(0, n);
		}
	}

	private void dfs(int deep, int min) {
		//print
		if(work[deep] <= min){
			System.out.print(work[0]);
			for(int i = 1; i < n; i++){
				if(work[i] == 0) continue;
				System.out.print(" " + work[i]);
			}
			System.out.println();
		}
		if(deep == n) return;
		
		for(int i = work[deep]-1; i >= 1; i--){
			if(min < i) continue;
			work[deep + 1] = work[deep] - i;
			work[deep] = i;
			dfs(deep + 1, Math.min(i, min));
			work[deep] = work[deep + 1] + i;
			work[deep + 1] = 0;
		}
		
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}