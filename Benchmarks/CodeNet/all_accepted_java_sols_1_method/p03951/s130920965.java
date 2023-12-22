import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String s = in.next();
		String t = in.next();
		int ans;

		String s_sub, t_sub;
		for (int i = 0; i < N; i++) {
			//sのi文字目からN-1文字目まで==tの0文字目からN-i-1文字目までが一致？
			s_sub = s.substring(i, N);
			t_sub = t.substring(0, N-i);
			if(s_sub.equals(t_sub)) {
				ans = 2*N - (N-i);
				System.out.println(ans);
				return;
			}
		}
		System.out.println(2*N);
	}
}