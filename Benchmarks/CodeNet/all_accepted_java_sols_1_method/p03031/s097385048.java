import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Integer,List<Integer>> s = new HashMap<>();
		for(int i=0;i<m;i++) {
			List<Integer> list = new ArrayList<>();
			int k = in.nextInt();
			for(int j=0;j<k;j++) {
				list.add(in.nextInt()-1);
			}
			s.put(i, list);
		}
		int[] p = new int[m];
		for(int i=0;i<m;i++) {
			p[i] = in.nextInt();
		}
		int ans = 0;
		int max = 1<<n;
		for(int i=0;i<max;i++) {
			int[] s_tmp = new int[n];
			for(int j=0;j<n;j++) {
				s_tmp[j] = (i>>j)&1;
			}
			boolean fail = false;
			for(int idx : s.keySet()) {
				int count = 0;
				for(int idx2 : s.get(idx)) {
					count += s_tmp[idx2];
				}
				if(count%2!=p[idx]) {
					fail = true;
					break;
				}
			}
			if(fail) continue;
			else ans++;
		}
		System.out.println(ans);
		in.close();
	}

}
