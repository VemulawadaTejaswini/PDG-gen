import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(n-- > 0) {
			a.add(Integer.parseInt(sc.next()));
		}
		int q = Integer.parseInt(sc.next());
		ArrayList<Integer> ansl = new ArrayList<Integer>();
		for(int tt = -0; tt < q; tt++) {
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
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