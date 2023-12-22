import java.util.Scanner;

public class Main {

	private Main() {
		Scanner in = new Scanner(System.in);
		long a,b;
		while(in.hasNext()){
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}

	public long gcd(long a, long b) {
		if(a==b){
			return a;
		} else if(a>b) {
			return gcd(b,a-b);
		} else {
			return gcd(a,b-a);
		}
	}

	public long lcm(long a, long b) {
		return a*b/gcd(a,b);
	}

	public static void main(String[] args) {
		new Main();
	}
}