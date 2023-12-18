import java.util.Scanner;

//AtCoder Grand Contest 148
//D	Brick Break
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] aArr = new int[N];
		boolean hasOne = false;
		for (int i = 0; i < N; i++) {
			aArr[i] = Integer.parseInt(sc.next());
			if (aArr[i] == 1) {
				hasOne = true;
			}
		}
		sc.close();

		int ans = 0;
		if (hasOne) {
			int target = 1;
			for (int i = 0; i < N; i++) {
				if (aArr[i] == target) {
					target++;
				} else {
					ans++;
				}
			}
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
	}
}
