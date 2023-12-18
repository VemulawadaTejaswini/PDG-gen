import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, K;
	static int[] s;
	static int[][] b;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		N = sc.nextInt(); K = sc.nextInt();
		if( N == 0 && K == 0 )return false;
		s = new int[K];
		b = new int[N][K];
		for(int i = 0; i < s.length; i++){
			s[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++){
			for(int j = 0; j < K; j++){
				b[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve(){
		for(int i = 0; i < N; i++){
			for(int j = 0; j < K; j++){
				s[j] -= b[i][j];
			}
		}
		boolean flag = true;
		for(int i = 0; i < s.length; i++){
			if( s[i] < 0 )flag = false;
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}