import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	
	long gcd(long a, long b){
		return a==0 ? b : gcd(b%a, a);
	}
	
	long lcm(long a, long b){
		return a*b / gcd(a, b);
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			final long a = sc.nextInt();  final long b = sc.nextInt();
			System.out.println(gcd(a, b) + " " + lcm(a, b));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os){
		System.out.println(Arrays.deepToString(os));
	}
}