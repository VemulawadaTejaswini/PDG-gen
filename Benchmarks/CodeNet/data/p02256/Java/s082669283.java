import java.util.*;

public class Main{
	final int MOD = 1000000007;
	final int INF = 1000000000;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();
		System.out.println(gcd(x, y));
	}

	public static int gcd(int a, int b){
		if(b == 0) return a;
		if(a % b != 0) return gcd(b, a % b);
		return b;
	}
}

