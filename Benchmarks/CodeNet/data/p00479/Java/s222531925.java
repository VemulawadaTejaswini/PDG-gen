import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, k;
	static int[] a, b;
	static int[][] flag;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[k];
		b = new int[k];
		flag = new int[n][n];
		for(int i= 0; i < k; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < flag.length; i++){
			for(int j = 0; j < flag[0].length; j++){
				int k = Math.min(i, j);
				if(k%3 == 0)flag[i][j] = 1;
				if(k%3 == 1)flag[i][j] = 2;
				if(k%3 == 2)flag[i][j] = 3;
			}
		}
		return true;
	}
	
	static void solve(){
		for(int i = 0; i < a.length && i < b.length; i++){
			int x = a[i]-1, y = b[i]-1;
			if(y >= n/2){
				y = n-b[i];
			}
			if(x >= n/2){
				x = n-a[i];
			}
			System.out.println(flag[y][x]);
		}
	}

}