import java.util.Scanner;

class Main {
	public static int a, b;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			a = cin.nextInt();
			b = cin.nextInt();
			solve();
		}
	}

	public static void solve() {
		if(a < b){
			int tmp = a;
			a = b;
			b = a;
		}
		int g = gcd(a, b);
		System.out.printf("%d %d\n", g, (long)a * (long)b / g);
	}
	public static int gcd(int x, int y){
		if(y == 0){
			return x;
		}
		return gcd(y, x % y);
	}
}