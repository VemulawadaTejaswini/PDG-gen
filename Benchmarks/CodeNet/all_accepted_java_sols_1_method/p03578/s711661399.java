import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(f.readLine());
		Map<Integer, Integer> ncount = new HashMap<>();
		StringTokenizer st = new StringTokenizer(f.readLine());
		for(int i = 0; i < n; i++) {
			int next = Integer.parseInt(st.nextToken());
			if(!ncount.containsKey(next)) {
				ncount.put(next, 1);
			} else {
				ncount.put(next, ncount.get(next) + 1);
			}
		}
		int m = Integer.parseInt(f.readLine());
		Map<Integer, Integer> mcount = new HashMap<>();
		st = new StringTokenizer(f.readLine());
		for(int i = 0; i < m; i++) {
			int next = Integer.parseInt(st.nextToken());
			if(!mcount.containsKey(next)) {
				mcount.put(next, 1);
			} else {
				mcount.put(next, mcount.get(next) + 1);
			}
		}
		boolean good = true;
		for(int mkey : mcount.keySet()) {
			if(!ncount.containsKey(mkey)) {
				good = false;
				break;
			}
			if(mcount.get(mkey) > ncount.get(mkey)) {
				good = false;
				break;
			}
		}
		if(good) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
