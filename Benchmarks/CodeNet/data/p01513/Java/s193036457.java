import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static boolean[][] list;
	static boolean[] k;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		
		list = new boolean[n+1][n+1];
		k = new boolean[n+1];
		for(boolean[] a : list)Arrays.fill(a, false);
		Arrays.fill(k, false);
		for(int i = 1; i < list.length; i++){
			int c = sc.nextInt();
			for(int j = 1; j <= c; j++){
				list[i][sc.nextInt()] = true;
			}
		}
		int c = sc.nextInt();
		for(int i = 1; i <= c; i++){
			k[sc.nextInt()] = true;
		}
		return true;
	}
	
	static void solve(){
		boolean isIdentify = true;
		boolean isHeCriminal = true;
		int criminal = -1;
		for(int i = 1; i < list.length; i++){
			for(int j = 1; j < list[0].length; j++){
				if(k[j] && !list[i][j])isHeCriminal = false;
			}
			if(criminal == -1 && isHeCriminal){
				criminal = i;
			}else if(isHeCriminal){
				isIdentify = false;
			}
			isHeCriminal = true;
		}
		if(isIdentify){
			System.out.println(criminal);
		}else{
			System.out.println(-1);
		}
		
	}

}