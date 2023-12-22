import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}
	//最大公約数gcdを求める
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	//最小公倍数lcmを求める
	static long lcm (int a, int b) {
		int temp;
		long c = a;
		long d = b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c*d)/b;
	}
}
