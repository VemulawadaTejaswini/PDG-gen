
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long ans = 0;
		if(a < 0 && b <= 0 && c < 0 && d <= 0) {
			ans = a * c;
			System.out.print(ans);
		}else if(a < 0 && b <= 0) {
			if(b == 0 || c == 0 || d == 0){
				System.out.print(0);
			}else if(c < 0 && d > 0) {
				ans = a * c;
				System.out.print(ans);
			}else if(c > 0 && d > 0){
				ans = b * c;
				System.out.print(ans);
			}else{
				throw new Exception();
			}
		}else if(c < 0 && d <= 0) {
			if(d == 0 || a == 0 || b == 0){
				System.out.print(0);
			}else if(a < 0 && b > 0) {
				ans = c * a;
				System.out.print(ans);
			}else if(a > 0 && b > 0) {
				ans = d * a;
				System.out.print(ans);
			}else {
				throw new Exception();
			}
		}else if (b > 0 && d > 0) {
			ans = b * d;
			System.out.print(ans);
		}else {
			throw new Exception();
		}

		sc.close();
	}
}