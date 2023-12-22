import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;
	
	void doIt() {
		 int n = sc.nextInt();
		 if(n % 2 != 0) {
			 System.out.println("No");
			 return;
		 }
		 String s = sc.next();
		 if(s.substring(0, n / 2).equals(s.substring(n / 2, n))) {
			 System.out.println("Yes");
		 }
		 else {
			 System.out.println("No");
		 }
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
