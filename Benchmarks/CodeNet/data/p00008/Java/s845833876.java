import java.util.*;
import java.io.*;
public class Main {
	public static void main(String... args) {
		Main m = new Main();
		m.solve();
		m.close();
	}

	private Scanner sc;
	private PrintWriter pw;

	public Main() {
		sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
	}
	private void close() {
		pw.flush(); pw.close();
	}
	private boolean has() { return sc.hasNextInt(); }
	private int nint()    { return sc.nextInt();    }

	private void solve() {
		HashMap<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();
		int[][] x = new int[10][4];
		for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
		for(int k = 0; k < 10; k++) {
		for(int l = 0; l < 10; l++) {
			int T = i+j+k+l;
			if(m.containsKey(T)) {
				m.get(T).add(1);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(1);
				m.put(T,list);
			}
		}}}

		}

		while(has()) {
			Object obj = m.get(nint());
			int ans = obj == null ? 0 : ((List)obj).size();
			pw.println(ans);
		}
	}
}