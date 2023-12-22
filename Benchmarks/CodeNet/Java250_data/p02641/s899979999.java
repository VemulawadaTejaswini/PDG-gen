import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

		List<Integer> p = new ArrayList<>();
		
		if (N == 0) {
			System.out.println(X);
			return;
		}
		for (int i = 1; i <=N ; i++) {
			p.add(sc.nextInt());
		}
		if (!p.contains(X)) {
			System.out.println(X);
			return;
		}
		
		int cost_l = Math.abs(X - 0);
		int ans_l = 0;
		
		for (int i = X -1; i >= 0 ; i--) {
			if(!p.contains(i)) {
				ans_l = i;
				cost_l = Math.abs(X - i);
				break;
			}
		}
		int cost_r = Math.abs(101 - X);
		int ans_r = 101;
		
		for (int i = X +1; i <= 101  ; i++) {
			if(!p.contains(i)) {
				ans_r = i;
				cost_r = Math.abs(X - i);
				break;
			}
		}		
		
		if(cost_l < cost_r) {
			System.out.println(ans_l);
		}
		else if(cost_l > cost_r) {
			System.out.println(ans_r);
		}
		else {
			System.out.println(ans_l);
		}
		
	}
}
