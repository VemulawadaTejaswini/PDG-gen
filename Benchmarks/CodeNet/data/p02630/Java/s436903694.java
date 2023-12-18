import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			if(map.get(A)==null) {
				map.put(A, 1);
			} else {
				map.put(A, map.get(A)+1);
			}
		}
		
		long ans = 0;
		for(int key : map.keySet()) {
			ans += (long)key*map.get(key);
		}
		
		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int B = sc.nextInt();
			int C = sc.nextInt();
			if(map.get(B) != null) {
				int v = map.get(B);
				ans += (long)(C-B)*v;
				if(map.get(C)==null) {
					map.put(C, v);
				} else {
					map.put(C, v+map.get(C));
				}
			}
			pw.println(ans);
		}
		
		sc.close();
		pw.close();
	}
}
