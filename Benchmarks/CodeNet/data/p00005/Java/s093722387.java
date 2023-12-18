import java.util.Scanner;

class Main {
	public static long a, b;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			a = cin.nextLong();
			b = cin.nextLong();
			solve();
		}
	}

	public static void solve() {
		if(a < b){
			Long tmp = a;
			a = b;
			b = a;
		}
		Long g = gcd(a, b);
		System.out.printf("%d %d", g, a * b / g);
	}
	public static Long gcd(Long x, Long y){
		if(y == 0){
			return x;
		}
		return gcd(y, x % y);
	}
}