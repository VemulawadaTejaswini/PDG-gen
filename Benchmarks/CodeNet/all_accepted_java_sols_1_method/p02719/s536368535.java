import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long k = scan.nextLong();

		long ans;
		if(n % k == 0) {
			ans = 0;
		}else {
			if(Math.abs(n % k) > Math.abs((n % k) - k)){
				ans = Math.abs((n % k) - k);
			}else {
				ans = Math.abs(n % k);
			}
		}
		System.out.println(ans);
	}
}
