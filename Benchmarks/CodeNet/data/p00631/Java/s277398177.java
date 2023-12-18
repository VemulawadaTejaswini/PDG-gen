
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int n;
	public static int[] power;
	public static int ans = Integer.MAX_VALUE;


	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	public static boolean read(){
		n = sc.nextInt();

		if(n == 0)  return false;

		power = new int[n];

		for(int i=0; i<n; i++){
			power[i] = sc.nextInt();
		}

		return true;
	}

	public static void solve(){
		dfs(0, 0, 0);
		System.out.println(ans);
	}

	public static void dfs(int depth, int A, int B){
		if(depth == n){
			if(ans > Math.abs(A-B)){
				ans = Math.abs(A-B);
				return;
			}

		} else{
			dfs(depth + 1, A+power[depth], B);
			dfs(depth + 1, A, B+power[depth]);
		}

	}


}