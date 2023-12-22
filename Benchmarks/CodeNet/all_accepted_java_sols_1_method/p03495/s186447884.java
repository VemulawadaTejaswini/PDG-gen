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
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[200100];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0 ; i < n ; i++) {
			b[a[i]]++;
		}
		Arrays.sort(b);
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i < n ; i++) {
			set.add(a[i]);
		}
		if(set.size() <= k) {
			System.out.println(0);
			return;
		}
		int size = set.size();
		long ans = 0;
		int i = 0;
		while(size > k) {
			if(b[i] != 0) {
				for(;;) {
					b[i]--;
					ans++;
					if(b[i] == 0) {
						break;
					}
				}
				size--;
			}
			i++;
		}
		System.out.println(ans);
	}
}
