import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		long d;
		n = scan.nextInt();
		d = scan.nextLong();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			long x,y;
			x = scan.nextLong();
			y = scan.nextLong();
			if (x*x+y*y <= d*d) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}