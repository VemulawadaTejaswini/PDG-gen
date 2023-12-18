import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int M, N;
	static int[] a;
	public static void main(String[] args) {
		read();
		solve();
	}
	static void read(){
		M = sc.nextInt(); N = sc.nextInt();
		a = new int[M];
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++ ){
				a[i] = a[i] + sc.nextInt();
			}
		}
	}
	static void solve(){
		java.util.Arrays.sort(a);
		System.out.println(a[M-1]);
	}
}