import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static boolean[] prime;
	public static void main(String[] args) {
		makePrime();
		while(read()){
			solve();
		}
	}

	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		return true;
	}
	static void solve(){
		int res = 0;
		for(int i = 2; i <= n; i++){
			if(prime[i])res++;
		}
		System.out.println(res);
	}
	
	static void makePrime(){
		prime = new boolean[1000001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i = 2; i < prime.length; i++){
			if(prime[i]){
				for(int j = i*2; j < prime.length; j = j + i){
					prime[j] = false;
				}
			}
		}
	}
}