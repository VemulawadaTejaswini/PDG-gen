import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
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
}				
