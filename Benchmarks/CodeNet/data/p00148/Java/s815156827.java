import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		while(sc.hasNext()){
			solve();
		}
	}

	private void solve() {
		int n = sc.nextInt();
		int res = n % 39;
		if(res == 0) res = 39;
		System.out.printf("3C%02d\n",res);
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}