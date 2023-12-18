import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x  = Math.abs(sc.nextLong());
		long k  = sc.nextLong();
		long d  = sc.nextLong();
		long ans = 0;

		//0に近づけるだけでk回動く場合
		if(k * d <= x) {
			System.out.println(x - (k * d));
			sc.close();
			return;
		}
		
		//最初にできるだけ0に近づける
		long devide = x / d;
		
		if((k - devide) % 2 == 0) {
			ans = x % d;
		}
		
		if((k - devide) % 2 != 0) {
			ans = d - (x % d);
		}
		
		System.out.println(ans);
		sc.close();
	}
}


