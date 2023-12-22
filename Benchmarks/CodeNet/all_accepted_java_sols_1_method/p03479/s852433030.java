import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		int ans = 1;
		long tmp = x;
		while(tmp <= y) {
			if(tmp * 2 <= y) {
				ans++;
			
			}
			tmp = tmp*2;
		}
		System.out.print(ans);
	}
}