import java.util.*;
import java.awt.Frame;
import java.io.*;

public class Main {
	// static ArrayList<Integer>[] g;

	static pair[] a;
	static int[][] memo;

	static int dp(int l, int r) {
		if (l > r)
			return 0;
		if (memo[l][r] != -1)
			return memo[l][r];
		int ans = dp(l + 1, r);
		ans = Math.max(ans, dp(l, r - 1));
		for (int idx : startAt[l]) {
			if (a[idx].y >= r)
				continue;
			int inc = exist[a[idx].y + 1][r] ? 1 : 0;
			ans = Math.max(ans, 1 + dp(a[idx].x, a[idx].y) + inc + dp(a[idx].y + 1, r));
		}
		for (int idx : endAt[r]) {
			if (a[idx].x <= l)
				continue;
			int inc = exist[l][a[idx].x - 1] ? 1 : 0;
			ans = Math.max(ans, 1 + dp(a[idx].x, a[idx].y) + inc + dp(a[idx].y + 1, r));
		}

		return memo[l][r] = ans;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
				char[] a=br.readLine().toCharArray();
				if(a[0]=='R' && a[1]=='R' && a[2]=='R')
					pw.println(3);
				else if((a[0]=='R' && a[1]=='R')|| (a[1]=='R' && a[2]=='R'))
					pw.println(2);
				else if(a[0]=='R' || a[1]=='R'|| a[2]=='R')
					pw.println(1);
				else
					pw.println(0);

		pw.flush();
		pw.close();

	}

	static int maxSize;
	static boolean[][] exist;
	static ArrayList<Integer>[] startAt, endAt;

	static void compress(pair[] arr) {
		TreeSet<Integer> tr = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			tr.add(arr[i].x);
			tr.add(arr[i].y);
		}
		tr.add(0);
		tr.add((int) 1e9);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int x : tr)
			hm.put(x, hm.size());
		for (int i = 0; i < arr.length; i++) {
			arr[i].x = hm.get(arr[i].x);
			arr[i].y = hm.get(arr[i].y);
		}
		maxSize = hm.size();
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			int x1 = y - x;
			int x2 = o.y - o.x;
			return x1 - x2;
		}

	}

}