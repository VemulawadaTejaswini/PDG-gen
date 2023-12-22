import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int p[] = new int[N];

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;

		int s1 = 0;
		int s2 = 0;
		int s3 = 0;

		for (int i = 0; i < N; i++) {
			if (p[i] <= A) {
				cnt1++;
			} else {
				s1 = i;
				break;
			}
		}
		if(cnt1 == 0) {
			System.out.println(0);
			return;
		}
		for (int i = s1; i < N; i++) {
			if (p[i] <= B) {
				cnt2++;
			} else {
				cnt3++;
			}
		}
		if(cnt2 == 0 || cnt3 ==0) {
			System.out.println(0);
			return;
		}

		int ans = Math.min(cnt1, cnt2);
		ans = Math.min(ans, cnt3);
		System.out.println(ans);

	}
}
