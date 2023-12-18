import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(360/gcd(x,360));
	}
	static int gcd(int a,int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
