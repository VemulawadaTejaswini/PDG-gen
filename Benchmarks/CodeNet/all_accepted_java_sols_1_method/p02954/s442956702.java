import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int cnt = 0;
		int temp = 0;
		int l_cnt = 0;
		int r_cnt = 0;
		int ans[] = new int[N];
		for(int i = 0; i < N - 1; i++) {
			if(S.substring(i, i + 1).equals("R") && S.substring(i + 1, i + 2).equals("L")) {
				temp = i;
				cnt++;
			} else if(S.substring(i, i + 1).equals("L") && S.substring(i + 1, i + 2).equals("R")){
				cnt++;
				if(cnt % 2 == 0) {
					ans[temp] = cnt / 2;
					ans[temp + 1] = cnt / 2;
				} else {
					if(r_cnt > l_cnt) {
						if(r_cnt % 2 == 1) {
							ans[temp] = cnt / 2;
							ans[temp + 1] = cnt / 2 + 1;
						} else {
							ans[temp] = cnt / 2 + 1;
							ans[temp + 1] = cnt / 2;
						}
					} else {
						if(l_cnt % 2 == 1) {
							ans[temp] = cnt / 2 + 1;
							ans[temp + 1] = cnt / 2;
						} else {
							ans[temp] = cnt / 2;
							ans[temp + 1] = cnt / 2 + 1;
						}
					}
				}
				cnt = 0;
				r_cnt = 0;
				l_cnt = 0;
			} else {
				cnt++;
				if(S.substring(i, i + 1).equals("R")) {
					r_cnt++;
				} else {
					l_cnt++;
				}
			}
		}
		cnt++;
		if(cnt % 2 == 0) {
			ans[temp] = cnt / 2;
			ans[temp + 1] = cnt / 2;
		} else {
			if(r_cnt > l_cnt) {
				if(r_cnt % 2 == 1) {
					ans[temp] = cnt / 2;
					ans[temp + 1] = cnt / 2 + 1;
				} else {
					ans[temp] = cnt / 2 + 1;
					ans[temp + 1] = cnt / 2;
				}
			} else {
				if(l_cnt % 2 == 1) {
					ans[temp] = cnt / 2 + 1;
					ans[temp + 1] = cnt / 2;
				} else {
					ans[temp] = cnt / 2;
					ans[temp + 1] = cnt / 2 + 1;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			if(i == N - 1) {
				System.out.println(ans[i]);
			} else {
				System.out.print(ans[i] + " ");
			}
		}
	}
}
