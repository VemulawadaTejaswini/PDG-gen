import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for(int i = 1; i <= n; i++){
			map.put(i, new HashSet<Integer>());
		}
		int x, y;
		for(int i = 0; i < m; i++){
			x = sc.nextInt();
			y = sc.nextInt();
			map.get(x).add(y);
			map.get(y).add(x);
		}
		Set<Integer> now = new HashSet<>();
		Set<Integer> tmp = new HashSet<>();
		Set<Integer> zan = new HashSet<>();
		Set<Integer> set = new HashSet<>();
		now.add(1);
		for(int i = 2; i <= n; i++){
			zan.add(i);
		}
		int[] ans = new int[n+1];
		while(zan.size() > 0){
			for(Integer p : now){
				set = map.get(p);
				for(Integer i : set){
					if(ans[i] > 0)continue;
					ans[i] = p;
					zan.remove(i);
					tmp.add(i);
				}
			}
			if(tmp.isEmpty()){
				System.out.println("No");
				return;
			}
			now.clear();
			now.addAll(tmp);
			tmp.clear();
		}
		System.out.println("Yes");
		for(int i = 2; i <= n; i++){
			System.out.println(ans[i]);
		}
	}
}