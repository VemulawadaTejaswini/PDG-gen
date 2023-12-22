
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> a = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a.add(sc.nextLong() - i - 1);
		}
		Collections.sort(a);
		long b = a.get(a.size() / 2);
		long ans = 0;
		for(Long e : a) {
			ans += Math.abs(e - b);
		}
		System.out.println(ans);
	}

}
