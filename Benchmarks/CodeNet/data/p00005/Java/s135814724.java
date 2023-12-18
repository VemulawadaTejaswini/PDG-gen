import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			Long m = scan.nextLong();
			Long n = scan.nextLong();
			Long g = gcd(m, n);
			System.out.println(g+" "+(m*n/g));
		}
	}
	
	private static Long gcd(Long a, Long b){
		return (b == 0)? a:gcd(b, a%b);
	}
}