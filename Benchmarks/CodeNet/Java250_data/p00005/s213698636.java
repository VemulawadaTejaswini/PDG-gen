import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			long a = Long.parseLong(scan.next());
			long b = Long.parseLong(scan.next());
			long c = gcd(a,b);
			long d = a*b/c;
			System.out.println(c+" "+d);
		}
		System.exit(0);
	}
	static long gcd(long i ,long j){
		return j == 0 ? i : gcd(j, i % j);
	}
}