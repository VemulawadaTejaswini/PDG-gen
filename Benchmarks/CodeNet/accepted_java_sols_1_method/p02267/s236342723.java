import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> T = new ArrayList<Integer>();
		List<Integer> S = new ArrayList<Integer>();
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			S.add(val);
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int val = in.nextInt();
			T.add(val);
		}
		
		int cnt = 0;
		for (int i = 0; i < T.size(); i++) {
			int tval = T.get(i);
			for (int j = 0; j < S.size(); j++) {
				if (tval == S.get(j)) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}

