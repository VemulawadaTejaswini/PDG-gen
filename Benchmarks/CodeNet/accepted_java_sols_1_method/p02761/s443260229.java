import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean key = true;
		int[] ans = new int[N];
		for (int i = 0; i < N; i++) ans[i] = 10;
		int res = 0;
		List<int[]> in = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			int[] stock = new int[2];
			stock[0] = sc.nextInt();
			stock[1] = sc.nextInt();
			in.add(stock);
		}
		
		for (int i = 0; i < in.size(); i++) {
			int si = in.get(i)[0];
			int ci = in.get(i)[1];
			if ((N < si) 
					|| (N != 1 && si == 1 && ci == 0)
					|| (ans[si-1] != 10 && ans[si-1] != ci)) {
				key = false;
				break;
			} else {
				ans[si-1] = ci;
			}
		}
		if (key) {
			for (int i = 0; i < ans.length; i++) {
				if (N == 1 && ans[0] == 10) {
					res = 0;
					System.out.println(0);
					System.exit(0);
				}
				if (ans[0] == 10) {
					ans[0] = 1;
				}
				if (ans[i] != 10) {
					sb.append(ans[i]);
				} else {
					sb.append("0");
				}
			}
			res = Integer.parseInt(sb.toString());
			System.out.println(res);
		} else {
			System.out.println(-1);
		}
		
	}
}