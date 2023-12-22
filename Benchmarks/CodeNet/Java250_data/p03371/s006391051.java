import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long x=sc.nextLong();
		long y=sc.nextLong();
		long ans = 0;
		if(a+b>=2*c) {
			if(x<=y) {
				ans += x * 2 * c;
				if(b>=2*c) {
					ans += (y-x)*2*c;
				} else {
					ans += (y-x)*b;
				}
			}else {
				ans += y * 2 * c;
				if(a>=2*c) {
					ans += (x-y)*2*c;
				} else {
					ans += (x-y)*a;
				}
			}
		} else {
			ans += a*x+b*y;
		}
		System.out.println(ans);
		sc.close();
	}
}
