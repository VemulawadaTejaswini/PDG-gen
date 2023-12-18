import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<String, Integer> set = new HashMap<>();
		int min=Integer.MAX_VALUE;
		int max=0;
		int step = 0;
		
		int ans = 1000;
		int kabu = 0;

		for (int i = 0; i < n+1; i++) {
			int a = i==n ? 0 : sc.nextInt();
			if( step == 0) {
				if( min >= a ) {
					min = a;
					continue;
				}else {
					max = a;
					step = 1;
				}
			}
			if( step == 1) {
				if( max <= a ) {
					max = a;
				}else {
					int p = ans / min;
					ans %= min;
					ans += max * p;
					step = 0;
					min=Integer.MAX_VALUE;
				}
			}
		}
		
		System.out.println(ans);
		
	}
}