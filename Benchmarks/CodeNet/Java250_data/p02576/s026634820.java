import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), x=sc.nextInt(), t=sc.nextInt();
		int s = ((n/x)*t) + ((n%x>0) ? t : 0);
		System.out.println(s);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
