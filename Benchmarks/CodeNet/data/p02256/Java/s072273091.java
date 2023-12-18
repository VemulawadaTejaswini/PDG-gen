import java.util.Scanner;
public class Main {
	static int[] arr = new int[110];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(gcd(a,b));
	}
	
	public static long gcd(long a,long b){
		return b==0?a:gcd(b,a%b);
	}
}
