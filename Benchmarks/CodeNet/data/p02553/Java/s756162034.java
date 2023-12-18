import java.util.Scanner;

public class Main {
	static long solve(long a , long b , long c , long d){
		long arr[] = {a , b , c , d};
		long ret = b * d;
		for(int i = 0 ; i < 2 ; ++i){
			for(int j = 2 ; j < 4 ; ++j){
				long x = arr[i] * arr[j];
				ret = Math.max(ret, x);
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		System.out.println(solve(a, b, c, d));
	}
}
