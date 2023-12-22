import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		HashMap<Integer,Integer> mochi = new HashMap<>(); 
		for(i=0;i<n;i++) {
			int d = Integer.parseInt(sc.next());
			Integer m = mochi.get(d);
			if(m == null) {
				mochi.put(d, 1);
			} else {
				mochi.put(d, m+1);
			}
		}
		sc.close();
		int ans = mochi.size();
		System.out.println(ans);
	}
}
