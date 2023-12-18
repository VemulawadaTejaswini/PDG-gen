import java.util.*;

public class Main{
	int ans, n;
	int [] garr;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			char []s = sc.next().toCharArray();
			char []g = sc.next().toCharArray();
			int [] sarr = new int[n];
			for(int i = 0; i < n;i++){
				sarr[i] = s[i] - '0';
			}
			garr = new int[n];
			for(int i = 0; i < n; i++){
				garr[i] = g[i] - '0';
			}
			ans = 1 << 24;
			dfs(sarr, 0);
			System.out.println(ans);
		}
	}

	private void dfs(int[] arr, int deep) {
		
		if(Arrays.equals(arr, garr)){
			ans = Math.min(ans, deep);
			return;
		}
		else if(deep == 2) return;
		if(ans <= deep) return;
		
		int pos;
		for(pos = deep; pos < n; pos++){
			if(garr[pos] != arr[pos]) break;
		}
		
		int diff1 = (arr[pos] - garr[pos] + 10) % 10;
		int diff2 = (garr[pos] - arr[pos] + 10) % 10;
		for(int i = pos; i < n; i++){
			for(int j = pos; j <= i; j++){
				arr[j] = (arr[j] + diff2) % 10;
			}
			dfs(arr, deep + 1);
			for(int j = pos; j <= i; j++){
				arr[j] = (arr[j] - diff2 + 10) % 10;
			}
		}
		
		for(int i = pos; i < n; i++){
			for(int j = pos; j <= i; j++){
				arr[j] = (arr[j] - diff1 + 10) %10;
			}
			dfs(arr, deep + 1);
			for(int j = pos; j <= i; j++){
				arr[j] = (arr[j] + diff1) % 10;
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