import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long takahashi = 1;
		long aoki = 1;
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int a = sc.nextInt();
			if((takahashi - 1)/t > (aoki - 1)/a) {
				takahashi = ((takahashi - 1)/t + 1)*t;
				aoki = ((takahashi - 1)/t + 1)*a;
			} else {
				takahashi = ((aoki - 1)/a + 1)*t;
				aoki = ((aoki - 1)/a + 1)*a;
			}
		}
		System.out.println(takahashi + aoki);
	}
}