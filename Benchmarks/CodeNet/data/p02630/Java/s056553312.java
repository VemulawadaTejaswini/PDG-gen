import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(n-- > 0) {
			a.add(sc.nextInt());
		}
		int q = sc.nextInt();
		ArrayList<Integer> ansl = new ArrayList<Integer>();
		for(int tt = -0; tt < q; tt++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			for(int i = 0; i < a.size(); i++) {
				if(b == a.get(i)) {
					a.set(i, c);
				}
			}
			int ans = 0;
			for(int t: a) {
				ans += t;
			}
			ansl.add(ans);
		}
		for(int aa: ansl) {
			System.out.println(aa);
		}
	}
}