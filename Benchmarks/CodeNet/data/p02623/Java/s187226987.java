import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int limit = sc.nextInt();
		long aMax = 0L;
		int aCount = 0;
		List<Long> al = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			long in = sc.nextLong();
			long temp = aMax + in;
			if (temp <= limit) {
				aMax = temp;
				aCount++;
			} else {
				sc.nextLine();
				break;
			}
		}
		int bCount = aCount;
		long bMax = aMax;
		int ans = aCount;
		for (int i = 0; i < m; i++) {
			long in = sc.nextLong();
			bMax = bMax + in;
			bCount++;
			while (bMax > limit && !al.isEmpty()) {
				bMax = bMax - al.remove(al.size() - 1);
				bCount--;
			}
			if (bMax > limit) {
				sc.nextLine();
				break;
			}
			if (ans < bCount) {
				ans = bCount;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
