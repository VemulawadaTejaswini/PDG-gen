
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long h = sc.nextInt();
		long amax = 0;
		List<Long> b = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			amax = (int) Math.max(amax, sc.nextDouble());
			b.add(sc.nextLong());
		}
		Collections.sort(b);
		Collections.reverse(b);
		long ans = 0;
		for(Long e : b) {
			if(e > amax && h > e) {
				h -= e;
				ans++;
			} else if(e > amax && h <= e) {
				h = 0;
				ans++;
				break;
			} else {
				break;
			}
		}
		ans += h / amax;
		if(h % amax != 0)
			ans++;
		System.out.println(ans);

	}

}
