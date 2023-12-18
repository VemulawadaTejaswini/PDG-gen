import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);
		String[] str_ary = reader.readLine().split("");
		int[] S = new int[N];
		for (int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(str_ary[i]);
		}
		int ans = 0;
		for (int k = 0; k <= 999; k++) {
			int k1 = k / 100;
			int k2 = (k - k1*100) / 10;
			int k3 = k % 10;
			boolean flag1 = false;
			boolean flag2 = false;
			boolean flag3 = false;
			int keep1 = -1;
			int keep2 = -1;
			int keep3 = -1;
			for (int i = 0; i < N; i++) {
				if (S[i] == k1) {
					flag1 = true;
					keep1 = i;
					break;
				}
			}
			if (flag1) {
				for (int i = keep1+1; i < N; i++) {
					if (S[i] == k2) {
						flag2 = true;
						keep2 = i;
						break;
					}
				}
			}
			if (flag1 && flag2) {
				for (int i = keep2+1; i < N; i++) {
					if (S[i] == k3) {
						flag3 = true;
						keep3 = i;
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
		
		
		//		int ans = N * (N-1) * (N-2) / 6;
		//		int[] kosuu = new int[9];
		//		for (int i = 0; i < N-2; i++) {
		//			for (int k = 1; k <= 9; k++) {
		//				if (S[i] == k) {
		//					kosuu[k]++;
		//				}
		//			}
		//		}
		
		
		
		//		int keep = 2;     //2, 1, 0とずらしていく
		//		for (int i = 0; i < N-2; i++) {
		//			for (int k = 0; k < i; k++) {
		//				if (S[i] == S[k]) {
		//					
		//				}
		//				
		//			}
		//		}
		
	}
}
