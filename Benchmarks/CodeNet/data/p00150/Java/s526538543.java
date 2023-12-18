import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[]prime;
	static int n;
	public static void main(String[] args) {
		makePrime();
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		return true;
	}
	static void solve(){
		int p = 0, q = 0;
		for(int i = 3; i <= n; i++){
			if(prime[i] == 1 && prime[i - 2] == 1){
				p = Math.max(p, i - 2);
				q = Math.max(q, i);
			}
		}
		System.out.print(p + " " + q);
		System.out.println();
	}
	static void makePrime(){
		prime = new int[10000+1];
		for(int i = 1; i < prime.length; i++)
			prime[i] = 1;
		for(int i = 2; i < prime.length; i++){
			if(prime[ i ] == 1){
				for(int j = i; i*j < prime.length; j++)
				prime[ i*j ] = 0;
			}
		}
	}
}