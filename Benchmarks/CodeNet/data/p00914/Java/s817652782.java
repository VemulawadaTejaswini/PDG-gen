import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			int s = stdIn.nextInt();
			if(n == 0 && k == 0 && s == 0) break;
			int ans =  solve(n,k,s);
			System.out.println(ans);
		}
	}
	
	public static int solve(int n, int k, int s) {
		int ret = 0;
		for(int i = n; i > 0; i--) {
			ret += solv(n,k-1,s-i,i);
		}
		return ret;
	}
	
	public static int solv(int n, int k, int s,int l) {
		if(s < 0) return 0;
		if(s == 0 && k == 0) return 1;
		if(s == 0 && k > 0) return 0;
		if(s != 0 && k < 0) return 0;
		int ret = 0;
		for(int i = l-1; i > 0; i--) {
			ret += solv(n,k-1,s-i,i);
		}
		return ret;
	}
}