import java.util.*;
public class Main {

	static void solve() {
			Scanner sc = new Scanner(System.in);
			long n = sc.nextInt();
			long mult = 1;
			for(int i = 0;i<n;i++) {
				long num = sc.nextLong();
				mult*=num;
			}
			if(mult<Math.pow(10,18)) {
				System.out.println(mult);
			}
			else
				System.out.println("-1");
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
