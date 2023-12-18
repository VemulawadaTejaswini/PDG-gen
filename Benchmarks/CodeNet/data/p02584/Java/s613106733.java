import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x  = sc.nextLong();
		long k  = sc.nextLong();
		long d  = sc.nextLong();
		long ans = 0;

		if(k * d <= x) {
			System.out.println(x - (k * d));
			sc.close();
			return;
		}
		
		//最初にできるだけ0に近づける
		long devide = x / d;
		long rest = x % d;
		
		//k - divideが偶数なら何もしない
		if((k - devide) % 2 == 0) {
			ans = rest;
		}
		
		//k - divideが奇数なら1度だけ正か負に動かして絶対値の小さいほう
		if((k - devide) % 2 != 0) {
			long culcA = rest + d;
			long culcB = rest - d;			
			ans = Math.min(Math.abs(culcA),Math.abs(culcB));
		}
		
		System.out.println(ans);
		sc.close();
	}
}


