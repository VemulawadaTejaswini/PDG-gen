import java.util.*;
public class Main {
	static int ans = 0;
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n,m,k;
		n = Integer.parseInt(scan.next());
		m = Integer.parseInt(scan.next());
		int[][] s = new int[m][n];
		int[] p = new int[m];
		for (int i = 0;i < m; ++i){
			Arrays.fill(s[i], 0);
			k = Integer.parseInt(scan.next());
			for (int j = 0;j < k; ++j){
				s[i][Integer.parseInt(scan.next())-1] = 1;
			}
		}
		for (int i = 0;i < m; ++i){
			p[i] = Integer.parseInt(scan.next());
		}

		int ans = 0;
		int count;
		boolean[] on = new boolean [n];
		boolean ok ;
		for (int i = 0;i < 1<<n; ++i){
			Arrays.fill(on, false);
			for (int j = 0;j < n; ++j){
				if ((1 & i>>j) == 1){
					on[j] = true;
				}
			}
			ok = true;
			for (int j = 0;j < m; ++j){
				count = 0;
				for (int l = 0;l < n; ++l){
					if (s[j][l] == 1 && on[l])++count;
				}
				if (count%2 != p[j])ok = false;
			}
			if (ok)++ans;

		}

		System.out.print(ans);


	}

}


//end