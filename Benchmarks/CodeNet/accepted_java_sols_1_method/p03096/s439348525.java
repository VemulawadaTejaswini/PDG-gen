
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] c = new int[n];
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		int[] place = new int[n];
		for (int i=0;i<=200_000;i++) {
			map.put(i, new ArrayList<Integer>());
		}
		for (int i=0;i<n;i++) {
			c[i]=sc.nextInt();
			place[i]=map.get(c[i]).size();
			map.get(c[i]).add(i);
		}
		long MOD = 1_000_000_007;
		long[] ans = new long[n];

		ans[0]=1;
		for (int i=1;i<n;i++) {
			ans[i]=ans[i-1];
			if (c[i]!=c[i-1]) {
				if (place[i]==1) {
					if (map.get(c[i]).get(0)>0) {
						ans[i]+=ans[map.get(c[i]).get(0)-1];
					}
					else {
						ans[i]++;
					}
					ans[i]%=MOD;
				}
				if (place[i]>1) {
					ans[i]+=ans[map.get(c[i]).get(place[i]-1)];
					ans[i]%=MOD;

				}
			}
		}

		System.out.println(ans[n-1]);
	}
}
