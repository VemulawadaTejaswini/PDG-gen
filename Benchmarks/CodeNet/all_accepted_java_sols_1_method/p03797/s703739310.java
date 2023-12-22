import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();//s
		long c = sc.nextLong();//c
		//s+2c = scc
		if(2*s >= c) {
			System.out.println(c/2);
		} else {//2s < c
			long ans = s;
			c -= 2*s;
			s = 0;
			ans += c/4L;
			System.out.println(ans);
		}
	}
}