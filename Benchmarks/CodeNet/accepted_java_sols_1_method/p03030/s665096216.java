import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		Map<String, List<Integer>> numMap = new TreeMap<>();
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			countMap.put(p,i);

			if(numMap.containsKey(s)){
				List<Integer> list =numMap.get(s);
				list.add(p);
				numMap.put(s,list);
			}else{
				List<Integer> list = new ArrayList<>();
				list.add(p);
				numMap.put(s,list);
			}
		}

		for (String key : numMap.keySet()) {
			List<Integer> list =numMap.get(key);
			// System.out.println(key + ":" + numMap.get(key));
			Collections.sort(list);
			Collections.reverse(list);

			for(int i=0;i<list.size();i++){
				int score = list.get(i);
				System.out.println(countMap.get(score));
			}

		}

	}

}
