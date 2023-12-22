import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 0;
	
	void doIt() {
		String s = sc.next();
		String[] d = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for(int i = 0; i < 7; i++) {
			if(s.equals(d[i])) {
				System.out.println(7 - i);
				return;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
