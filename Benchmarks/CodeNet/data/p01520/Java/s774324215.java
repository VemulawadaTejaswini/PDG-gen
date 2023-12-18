import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, T, E;
	static int[] x;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	static boolean read(){
		if(!sc.hasNext())return false;
		N = sc.nextInt();
		T = sc.nextInt();
		E = sc.nextInt();
		x = new int[N];
		for(int i = 0; i < x.length; i++){
			x[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		int min = T - E;
		int max = T + E;
		int res = -1;
		for(int i = 0; i < x.length; i++){
			for(int time = min; time <= max; time++){
				if(time % x[i] == 0){
					res = i+1;
					break;
				}
			}
		}
		System.out.println(res);
	}
}