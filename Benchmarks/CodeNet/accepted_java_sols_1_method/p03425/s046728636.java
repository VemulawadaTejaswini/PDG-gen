import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static boolean visit[] = new boolean[5];
	static long[] arr = new long[5];
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> m = new HashSet<>();
		Set<String> a = new HashSet<>();
		Set<String> r = new HashSet<>();
		Set<String> c = new HashSet<>();
		Set<String> h = new HashSet<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			switch (s.charAt(0)) {
			case 'M':
				m.add(s);
				break;
			case 'A':
				a.add(s);
				break;
			case 'R':
				r.add(s);
				break;
			case 'C':
				c.add(s);
				break;
			case 'H':
				h.add(s);
			default:
				break;
			}
		}
		arr = new long[5];
		arr[0] = m.size();
		arr[1] = a.size();
		arr[2] = r.size();
		arr[3] = c.size();
		arr[4] = h.size();
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] != 0) {
				count++;
			}
		}
		Arrays.sort(arr);
		long ans = 0L;
		if(count < 3) {
			System.out.println(0);
		} else if(count == 3) {
			System.out.println(arr[4]*arr[3]*arr[2]);
		} else if(count == 4) {
			System.out.println(arr[4]*arr[3]*arr[2]+arr[4]*arr[3]*arr[1]+arr[4]*arr[1]*arr[2]+arr[1]*arr[3]*arr[2]);
		} else {
			//System.out.println(bfs(0, 0L));
			System.out.println(arr[0]*arr[1]*arr[2]+arr[0]*arr[1]*arr[3]+arr[0]*arr[1]*arr[4]+arr[0]*arr[2]*arr[3]+arr[0]*arr[2]*arr[4]+arr[0]*arr[3]*arr[4]+arr[1]*arr[2]*arr[3]+arr[1]*arr[2]*arr[4]+arr[1]*arr[3]*arr[4]+arr[2]*arr[3]*arr[4]);
		}
	}
}