
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashMap<Integer, int[]> map = new HashMap<Integer, int[]>(); 
		while( !s.equals("") ) {
			String[] vs = s.split(",");
			int id = Integer.parseInt(vs[0]);
			if( map.containsKey(id) ) {
				int[] tmp = map.get(id); tmp[0]++;
				map.put(id, tmp);
			}
			else {
				int[] tmp = new int[2]; tmp[0]++;
				map.put(id, tmp);
			}
			s = sc.nextLine();
		}
		while( sc.hasNext() ) {
			s = sc.nextLine();
			String[] vs = s.split(",");
			int id = Integer.parseInt(vs[0]);
			if( map.containsKey(id) ) {
				int[] tmp = map.get(id); tmp[1]++;
				map.put(id, tmp);
			}
		}
		LinkedList<int[]> ans = new LinkedList<int[]>();
		for(Map.Entry<Integer, int[]> entry: map.entrySet()) {
			int[] tmp = entry.getValue();
			if(tmp[0] > 0 && tmp[1] > 0) ans.add( new int[] {entry.getKey(), tmp[0]+tmp[1] } );
		}
		Collections.sort(ans, new Comp());
		for(int[] a: ans) System.out.println(a[0] + " " + a[1]);
		
	}
	
	class Comp implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO 自動生成されたメソッド・スタブ
			return o1[0] - o2[0];
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}