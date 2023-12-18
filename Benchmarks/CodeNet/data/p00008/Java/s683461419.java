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
		HashMap<Integer, List<int[]>> m = new HashMap<Integer, List<int[]>>();
		for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
		for(int k = 0; k < 10; k++) {
		for(int l = 0; l < 10; l++) {
			int x = i+j+k+l;
			int z[] = new int[] {i,j,k,l};
			if(m.containsKey(x)) {
				m.get(x).add(z);
			} else {
				List<int[]> list = new ArrayList<int[]>();
				list.add(z);
				m.put(x,list);
			}
		}}}}
		while(has()) pw.println(m.get(nint()).size());
	}
}