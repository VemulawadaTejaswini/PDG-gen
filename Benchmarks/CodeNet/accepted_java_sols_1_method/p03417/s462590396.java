import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), m = sc.nextLong();
		if(n>m) {
			long tmp = n;
			n = m;
			m = tmp;
		}
		long ans = 0;
		if(n==1&&m==1) {
			System.out.println(1);
			return;
		}
		if(n==1) {
			ans = m-2;
			System.out.println(ans);
			return;
		}
		
		long t = n * 2 + (m-2) * 2;
		ans = n * m - t;
		System.out.println(ans);
	}
}
