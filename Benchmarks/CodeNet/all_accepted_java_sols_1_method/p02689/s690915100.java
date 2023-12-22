import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int h[] = new int[n];
		int a[] = new int[m];
		int b[] = new int[m];

		for (int i=0; i<n; i++){
			h[i] = sc.nextInt();
		}

		for (int i=0; i<m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		HashMap<Integer, HashSet<Integer>>map = new HashMap<Integer, HashSet<Integer>>();

		for (int i=1; i<=n; i++){
			map.put(i, new HashSet<Integer>());
		}

		for (int i=0; i<m; i++){

			HashSet<Integer> set = map.get(a[i]);
			set.add(b[i]);
			map.put(a[i], set);

			set = map.get(b[i]);
			set.add(a[i]);
			map.put(b[i], set);
		}

		int ans = 0;
		for (int i=0; i<n; i++){
			int fromH = h[i];
			HashSet<Integer> set = map.get(i+1);
			boolean bool= true;
			for (int to :set) {
				if (fromH <= h[to-1]){
					bool = false;
					break;
				}
			}
			if (bool){
				ans++;
			}
		}
		System.out.println(ans);
	}


}