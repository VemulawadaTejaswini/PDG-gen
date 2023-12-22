import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ab = a+b;
		long ans;
		
		if(n%ab==0) {
			ans = a*(n/ab);
		}
		else {
			ans = a*(n/ab)+Math.min(n%ab, a);
		}

		System.out.println(ans);

	}

}