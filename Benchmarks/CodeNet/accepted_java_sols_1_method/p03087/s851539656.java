
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		int[] left = new int[m];
		int[] right = new int[m];
		int[] cnt = new int[n+1];
		for(int i = 0; i < m; i++) {
			left[i] = sc.nextInt();
			right[i] = sc.nextInt();
		}
		for(int i = 1; i < n-1; i++) {
			if(cnt[i-1] != 0) {
				cnt[i] = cnt[i-1];
			}
			if(s.substring(i-1, i+1).equals("AC")) {
				cnt[i] ++ ;
			}
		}
		if(s.substring(n-2, n).equals("AC")) {
			cnt[n-1] = cnt[n-2] + 1;
		}else {
			cnt[n-1] = cnt[n-2];
		}

		//cnt[n-1] = cnt[n-2];

		System.out.println();
		for(int i = 0; i < m; i++) {
			int ans = cnt[right[i]-1] - cnt[left[i]-1];


			System.out.println(ans);
		}
		sc.close();
	}
}
