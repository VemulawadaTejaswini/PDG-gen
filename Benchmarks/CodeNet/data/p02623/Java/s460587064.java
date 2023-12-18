import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long aMax = 0L;
		int aCount = 0;
		List<Long> al = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			long in = sc.nextLong();
			long temp = aMax + in;
			if (temp <= k) {
				aMax = temp;
				aCount++;
			} else {
				break;
			}
		}
		int tempBCount = aCount;
		long bMax = aMax;
		int ans = aCount;
		for (int i = 0; i < m; i++) {
			long in = sc.nextLong();
			bMax = bMax + in;
			tempBCount++;

			while (bMax > k && !al.isEmpty()) {
				bMax = bMax - al.remove(al.size() - 1);
				tempBCount--;
			}
			if (bMax > k) {
				break;
			}
			if (ans < tempBCount) {
				ans = tempBCount;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
