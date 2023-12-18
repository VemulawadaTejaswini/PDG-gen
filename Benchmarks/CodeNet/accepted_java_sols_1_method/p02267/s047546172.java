import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> S = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			S.add(scan.nextInt());
		}
		int q = scan.nextInt();
		List<Integer> T = new ArrayList<Integer>(q);
		for (int i = 0; i < q; i++) {
			T.add(scan.nextInt());
		}
		
		int ans = 0;
		for (int i = 0; i < q; i++) {
			if (S.contains(T.get(i))) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		scan.close();
		
	}

}