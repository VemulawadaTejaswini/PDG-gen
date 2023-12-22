import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long x = n;
		for(int i = 0; i <= n; ++i) {
			long cnt = 0;
			long t = i;
			while(t > 0) {
				cnt += t % 6;
				t /= 6;
			}
			t = n - i;
			while(t > 0) {
				cnt += t % 9;
				t /= 9;
			}
			x = Math.min(x,  cnt);
		}
		
		System.out.println(x);
	}

}
