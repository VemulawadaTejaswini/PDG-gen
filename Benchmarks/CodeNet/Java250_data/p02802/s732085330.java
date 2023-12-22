import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Map<Integer, Problem> map = new HashMap<>();

		for(int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s =  sc.next();

			Problem problem;
			if(map.containsKey(p)) {
				problem = map.get(p);

			} else {
				problem = new Problem();
				map.put(p, problem);
			}
			problem.provideAns(s);
		}

		int ac = 0;
		int wa = 0;
		for(Entry<Integer, Problem> entry : map.entrySet()) {
			Problem problem = entry.getValue();
			ac += problem.getAs();
			wa += problem.getWa();
		}
		System.out.println(ac + " " + wa);
	}

}

class Problem {
	private static final String AC = "AC";
	private static final String WA = "WA";
	private int ac;
	private int wa;

	public Problem() {
		ac = 0;
		wa = 0;
	}

	public void provideAns(String str) {
		if(ac == 0) {
			if(AC.equals(str)) {
				ac = 1;
			} else if(WA.equals(str)){
				wa++;
			}
		}
	}

	public int getAs() {
		return this.ac;
	}

	public int getWa() {
		if(ac == 0) {
			return 0;
		}
		return this.wa;
	}
}