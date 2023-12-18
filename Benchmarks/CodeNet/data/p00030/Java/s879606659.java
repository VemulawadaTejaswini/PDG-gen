import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static int count = 0;
	public static void main(String[] args){

		for(;;){
			int n = scan.nextInt();
			int s = scan.nextInt();
			if(n == 0 && s == 0)break;
			count = 0;
			solve(0, n, s);
			System.out.printf("%d\n", count);
		}
	}

	private static void solve(int p, int n, int s){
		if(p > s || n == 0 || p > 9)return;
		if(n == 1 && p == s)count++;
		solve(p+1, n-1, s-p);
		solve(p+1, n, s);
	}
}