import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, P, Q, R, C;
	static int[][] confectioneries;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if( n == 0 )return false;
		confectioneries = new int[n][4];
		for(int i = 0; i < confectioneries.length; i++){
			for(int j = 0; j < confectioneries[0].length; j++){
				confectioneries[i][j] = sc.nextInt();
			}
		}
		P = sc.nextInt();
		Q = sc.nextInt();
		R = sc.nextInt();
		C = sc.nextInt();
		return true;
	}
	
	static void solve(){
		int kcal = 4;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < confectioneries.length; i++){
			int sum = 0;
			for(int j = 0; j < confectioneries[0].length; j++){
				sum += confectioneries[i][j] * kcal;
			}
			if( confectioneries[i][1] <= P
					&& confectioneries[i][2] <= Q
					&& confectioneries[i][3] <= R
					&& sum <= C){
				list.add(confectioneries[i][0]);
			}
		}
		if( list.isEmpty() ){
			System.out.println("NA");
		}else{
			for(int i = 0; i < list.size(); i++){
				System.out.println(list.get(i));
			}
		}
	}

}