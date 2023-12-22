import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[N];
		String[] ans = new String[M];

		Map<Integer, List<Integer>> citys = new TreeMap<>();

		for(int i=0;i<M;i++) {
			int n = sc.nextInt();
			int y = sc.nextInt();
			List<Integer> info = new ArrayList<>();
			info.add(n);
			info.add(i);
			citys.put(y, info);
		}

		for(int key : citys.keySet()) {
			List<Integer> c = citys.get(key);
			ans[c.get(1)] = String.format("%06d%06d", c.get(0),++P[c.get(0)-1]);
		}

		for(String a : ans) {
			System.out.println(a);
		}

		sc.close();


	}
}
