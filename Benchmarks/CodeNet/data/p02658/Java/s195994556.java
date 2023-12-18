
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Long> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			long v = sc.nextLong();
			if(v==0) {
				System.out.println(0);
				sc.close();
				return;
			}
			a.add(v);
		}
		long ans = 1;
		long MAX = (long)1e18;
		for(int i=0; i<n; i++) {
			long v = a.get(i);
			if(ans > MAX/v) {
				System.out.println(-1);
				sc.close();
				return;
			}
			ans *= v;
		}
		System.out.println(ans);
		sc.close();
	}


}