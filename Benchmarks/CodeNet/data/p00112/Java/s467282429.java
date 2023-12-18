import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, time;
	static int[] customer, waite;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		customer = new int[n];
		waite  = new int[n];
		for(int i = 0; i < n; i++){
			customer[i] = sc.nextInt();
		}
		return true;
	}
	static void solve(){
		int res = 0;
		java.util.Arrays.sort(customer);
		waite[0] = customer[0];
		for(int i = 1; i < n-1; i++){
			waite[i] = customer[i] + waite[i-1];
		}
		for(int i = 0; i < n-1; i++){
			res += waite[i];
		}
		System.out.println(res);
	}
}