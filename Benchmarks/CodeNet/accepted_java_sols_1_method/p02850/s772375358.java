import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] ary = new Integer[n+1];
		Arrays.fill(ary, 0);
		Map<List<Integer>, Integer> anss = new LinkedHashMap<>();
		TreeMap<Integer, List<Integer>> map = new TreeMap<>();
		for(int i=0; i<n-1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			ary[a]++;
			ary[b]++;
			List<Integer> pair = new ArrayList<>();
			pair.add(a);
			pair.add(b);
			anss.put(pair, -1);
			List<Integer> list = map.get(a);
			if(list == null) {
				list = new ArrayList<Integer>();
				list.add(b);
				map.put(a, list);
			} else {
				list.add(b);
				map.put(a, list);
			}
		}
		Arrays.sort(ary, Comparator.reverseOrder());
		System.out.println(ary[0]);

		//色付け処理
		// スタックを用意(どの頂点からきたのか、その頂点とその上の頂点は辺に何色を使っているのかの情報を盛り込む)
		Stack<List<Integer>> stack = new Stack<>();
		List<Integer> from = new ArrayList<>();
		from.add(map.firstKey());
		from.add(0);
		stack.push(from);
		while (!stack.empty()) {
			from = stack.pop();
			Integer tyouten = from.get(0);
			Integer color = from.get(1);
			List<Integer> l = map.get(tyouten);
			if(l == null) continue;
			int k = 1;
			for (Integer t: l) {
				if(color == k) k++;
				List<Integer> ans = new ArrayList<>();
				ans.add(tyouten);
				ans.add(t);
				anss.put(ans, k);
				List<Integer> ll = new ArrayList<>();
				ll.add(t);
				ll.add(k);
				k++;
				stack.push(ll);
			}
		}
		for (Integer ans : anss.values()) {
			System.out.println(ans);
		}
	}
}
