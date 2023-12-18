import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static long gcd(long a, long b){
		while(true){
			long r = a % b;
			if(r == 0){
				break;
			}
			a = b;
			b = r;
		}
		return a;
	}

	public static long lcm(long a, long b, long g){
		long v = a / g;
		long w = b / g;
		long l = v * w * g;
		return l;
	}

	public static void main(String[] args){

		while(scan.hasNext()){
			long a = scan.nextLong();
			long b = scan.nextLong();
			long g = gcd(a, b);
			long l = lcm(a, b, g);
			System.out.printf("%d %d\n", g, l);
		}
	}
}