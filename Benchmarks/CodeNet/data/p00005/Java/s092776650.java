import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			long x=in.nextLong(), y = in.nextLong();
			System.out.println(gcd(x,y) + " " + lcm(x,y));
		}
	}

	private static long gcd(long a, long b){
		return (a==0)?b:gcd(b%a, a);
	}

	private static long lcm(long a, long b){
		return a*b/gcd(a,b);
	}

}